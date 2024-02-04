package frc.robot;

// import frc.robot.subsystems.ShuffleBoard;
// import com.ctre.phoenix.sensors.Pigeon2;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.CommandScheduler;


public class Robot extends TimedRobot {
  private Command m_autonomousCommand;
  private RobotContainer m_robotContainer;
  // private ShuffleBoard shuffleBoard; 

  @Override
  public void robotInit() {

    m_robotContainer = new RobotContainer();
    // zeroHeading();

      // --------------------ShuffleBoard-------------------- \\
 //                                                                       |
      //Cria a instancia do ShuffleBoard aqui                             |
//       shuffleBoard = new ShuffleBoard();//                                |
//       shuffleBoard.actualYaw(); // Instância do angulo atual do robô      |
// //                                                                        |
      // --------------------ShuffleBoard-------------------- \\          

    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }

  }

  @Override
  public void robotPeriodic() {

    CommandScheduler.getInstance().run();

      // --------------------ShuffleBoard-------------------- \\
//                                                                        |
    //   //Aqui vc somente chama a instância                                 |
    // shuffleBoard.actualYaw();//                                           |
//                                                                        |
      // --------------------ShuffleBoard-------------------- \\

  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  // @Override
  // public void autonomousInit() {
  //   m_autonomousCommand = m_robotContainer.getAutonomousCommand();

  //   if (m_autonomousCommand != null) {
  //     m_autonomousCommand.schedule();
  //   }
  // }

  //  public void zeroHeading() {
  //    m_pigeon.setYaw(0);
  //  }


  //  private final Pigeon2 m_pigeon = new Pigeon2(7); // O ID do pigeon é o 7

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    
  }



  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}

}
