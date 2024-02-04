package frc.robot.commands.Launcher;
   
import frc.robot.subsystems.JointLauncherSubsystem;
import java.util.function.Supplier;

import edu.wpi.first.math.controller.ArmFeedforward;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.*;


public class JointLauncherCommand extends Command {

private final JointLauncherSubsystem jointLauncherSubsystem;
private final PIDController pidController;
private final Supplier<Double> setpointFunction;
private static double jointIntakeSetpoint;
public final Joystick m_operatorController = new Joystick(OIConstants.kOperatorControllerPort);

  public JointLauncherCommand(JointLauncherSubsystem jointLauncherSubsystem, Supplier<Double> setpointFunction) {
    this.setpointFunction = setpointFunction;
    this.jointLauncherSubsystem = jointLauncherSubsystem;
    this.pidController = new PIDController(
    LauncherConstants.kPIDAngulationMotorKp, 
    LauncherConstants.kPIDAngulationMotorKi, 
    LauncherConstants.kPIDAngulationMotorKd
    );

    addRequirements(jointLauncherSubsystem);

  }

  @Override
  public void initialize() {
    pidController.reset();
  }

  @Override
  public void execute() {
  jointIntakeSetpoint = setpointFunction.get();
  if(m_operatorController.getRawButton(OIConstants.LB)){
    LauncherConstants.AngulationMotorSetPoint -=0.1;}
  if(m_operatorController.getRawButton(OIConstants.RB)){
    LauncherConstants.AngulationMotorSetPoint +=0.1;}
    pidController.setSetpoint(jointIntakeSetpoint) ;
  
    SmartDashboard.putNumber("Setpoint JointIntake", pidController.getSetpoint());
    double speed = pidController.calculate(jointLauncherSubsystem.getJointLauncherPosition());
    
  
  jointLauncherSubsystem.setMotor(speed);
   SmartDashboard.putNumber("Velocity Intake", speed);
  }
  
  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    if(pidController.atSetpoint()){return true;}
    else{return false;}
  }
}
