
package frc.robot;
import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.IntakePositionConstants;
import frc.robot.Constants.LauncherConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Launcher.ChangeSetpointLauncherCmd;
import frc.robot.commands.Launcher.JointLauncherCommand;
import frc.robot.subsystems.JointLauncherSubsystem;


 
public class RobotContainer {

  // Subsistema do robo

  public final static JointLauncherSubsystem jointLauncherSubsystem = new JointLauncherSubsystem();
  
  // Controle do driver
  Joystick m_operatorController = new Joystick(OIConstants.kOperatorControllerPort);

  public RobotContainer() {
  configureButtonBindings();

    
    // m_robotDrive.setDefaultCommand(

    //     new RunCommand(
    //         () -> m_robotDrive.drive(
    //             MathUtil.applyDeadband(m_driverController.getY(), OIConstants.kDriveDeadband),
    //             MathUtil.applyDeadband(m_driverController.getX(), OIConstants.kDriveDeadband),
    //             -MathUtil.applyDeadband(m_driverController.getZ(), OIConstants.kDriveDeadband),
    //             true, true),
    //         m_robotDrive));

    //         new JoystickButton(m_driverController, Joystick.AxisType.kZ.value)
    //     .whileTrue(new RunCommand(() -> {
    //       double rotation = m_driverController.getRawAxis(Joystick.AxisType.kZ.value);
    //       m_robotDrive.rotate(rotation);
    //     }, m_robotDrive));
  }

  private void configureButtonBindings() {
    jointLauncherSubsystem.setDefaultCommand(new JointLauncherCommand(jointLauncherSubsystem, ()->LauncherConstants.AngulationMotorSetPoint));

      // ======================== Controle do Launcher ========================
  new JoystickButton(m_operatorController, OperatorConstants.kSpeakerPosition).whileTrue(new ChangeSetpointLauncherCmd(IntakePositionConstants.kIntakeToPiecePosition)); 
  new JoystickButton(m_operatorController, OperatorConstants.kSetAbsoluteZero).whileTrue(new RunCommand(() -> jointLauncherSubsystem.setZeroAbsoluteLauncher(), jointLauncherSubsystem)); 
}
 
   public Command getAutonomousCommand() {
    return new PathPlannerAuto("Example Auto");
   }


  // public static Command IntakeToPiece(){
  //   new ChangeSetpointLauncherCmd(IntakePositionConstants.kIntakeToPiecePosition),
  //   new LauncherCmd(launcherSubsystem, "Input")
  //   );
  // }

  
}





