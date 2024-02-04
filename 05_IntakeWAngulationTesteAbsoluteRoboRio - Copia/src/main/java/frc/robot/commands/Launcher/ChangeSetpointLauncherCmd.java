package frc.robot.commands.Launcher;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.LauncherConstants;;

public class ChangeSetpointLauncherCmd extends Command {

  public double jointLauncherSetpoint;

  public ChangeSetpointLauncherCmd(Double setpointLauncher) {
    jointLauncherSetpoint = setpointLauncher;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    LauncherConstants.AngulationMotorSetPoint = jointLauncherSetpoint;
  }

  @Override
  public void end(boolean interrupted) {

  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
