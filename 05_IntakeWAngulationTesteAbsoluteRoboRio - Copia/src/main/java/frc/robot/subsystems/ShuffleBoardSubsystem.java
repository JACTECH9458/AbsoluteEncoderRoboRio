// package frc.robot.subsystems;

// import com.ctre.phoenix.sensors.Pigeon2;

// import edu.wpi.first.networktables.GenericEntry;
// import edu.wpi.first.wpilibj.shuffleboard.*;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;

// public class ShuffleBoard extends SubsystemBase {
//         //------------------------Abas do ShuffleBoard------------------------\\
//         final ShuffleboardTab actualYawTab = Shuffleboard.getTab("Teleoperado"); // actualyawTab no Teleoperado

//         //------------------------Atualização de dados do ShuffleBoard------------------------\\
//         final GenericEntry yawEntry = actualYawTab
//         .add("actualYaw", 0).getEntry();  // Cria uma janela com o angulo atual do robô


//         //------------------------Métodos do ShuffleBoard------------------------\\


//         //-------------Ângulo X do Robo-------------\\
//         public void actualYaw() {  
//         Pigeon2 pigeon = new Pigeon2(7);
//         var yawValue = pigeon.getYaw();  
//         yawEntry.setDouble(yawValue);
//       }


// }

