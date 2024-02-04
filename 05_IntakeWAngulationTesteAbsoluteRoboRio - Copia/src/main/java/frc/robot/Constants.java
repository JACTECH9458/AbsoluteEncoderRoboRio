// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.JointLauncherSubsystem;


public final class Constants {
  
  public static final class OperatorConstants {
    public static final int kLauncherOutput = OIConstants.RT; // Lança a Game Piece
    public static final int kLauncherInput = OIConstants.LT; // Pega a Game Piece pelo Launcher
    public static final int kTriggerActive = OIConstants.A; // Pega a Game Piece pelo Launcher

    public static final int kAngulationUp = OIConstants.RB;
    public static final int kAngulationDown = OIConstants.LB;
    public static final int kSpeakerPosition = OIConstants.X; // Pega a Game Piece pelo Launcher
    public static final int kSetAbsoluteZero = OIConstants.B; // Seta o zero do Launcher

  }

  public static final class OIConstants {

    // =========================== Driver Joystick ===============================
    public static final int kOperatorControllerPort = 1;

    // public static final int brake = 3; //B

    public static final int LB = 5; //LB
    public static final int RB = 6; //RB

    public static final int A = 2; //a
    public static final int X = 1; //x
    public static final int B = 3; //b
    public static final int Y = 4; //y
    public static final int RT = 8; //RT
    public static final int LT = 7; //LT
    public static final int START = 10; //y

  }

  public static class LauncherConstants {
    public static final double kAngulationMotorId = 32;

    public static final double kAngulationMotorVelocity = 0.3;


    // PID constantes de angulação
    public static final double kPIDAngulationMotorKp = 0.03;
    public static final double kPIDAngulationMotorKi = 0;
    public static final double kPIDAngulationMotorKd = 0;

    // FeedForward
    public static final double kV = 0;
    public static final double kS = 0;
    public static final double kG = 0;
    public static double AngulationMotorSetPoint = 0;
  }


  public static class IntakePositionConstants{
    // ===== HOME =====
    public static final double kHomePosition = 0;
    // ===== INTAKE =====
    public static final double kIntakeToPiecePosition = 0.3;
    // ===== LAUNCHER =====
}

//   public static class LauncherPositionConstants{
//     // ===== HOME =====
//     public static final double kHomePosition = 0;
//     // ===== SHOOTER =====
//     public static final double kShooterPosition = 6;
//     // ===== INTAKE =====
//     public static final double kIntakePosition = 3;
//     // ===== AMP =====
//     public static final double kAmpPosition = 4.5;

// }
}


