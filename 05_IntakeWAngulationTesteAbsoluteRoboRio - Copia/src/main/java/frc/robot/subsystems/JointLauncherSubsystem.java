// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LauncherConstants;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;

public class JointLauncherSubsystem extends SubsystemBase {
  private final CANSparkMax jointLauncherMotorTeste = new CANSparkMax((int) LauncherConstants.kAngulationMotorId, CANSparkLowLevel.MotorType.kBrushless);
  public DutyCycleEncoder jointLauncherEncoder = new DutyCycleEncoder(0);

  public double getJointLauncherPosition(){
    return jointLauncherEncoder.getAbsolutePosition();
  }

  public JointLauncherSubsystem() {
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("JointLauncher Position",getJointLauncherPosition());
    SmartDashboard.putNumber("ActualCurrent", jointLauncherMotorTeste.getOutputCurrent());
    SmartDashboard.putBoolean("Encoder is Connected?", jointLauncherEncoder.isConnected());
  
  }

  public void setMotor(double speed)
  {jointLauncherMotorTeste.set(speed);}

  public boolean atPosition(double pos){
    if(Math.abs(getJointLauncherPosition()-pos)<1){
      return true;
    }else{return false;}
  }

  public void setZeroAbsoluteLauncher(){
    jointLauncherEncoder.reset();
  }

}
