
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;


public class Shooter_Subsystem extends SubsystemBase {

    private final WPI_TalonFX m_shooter_Motor = new WPI_TalonFX(ShooterConstants.kShooter_Motor_Port);
    private boolean shooter_state = false;

  public Shooter_Subsystem() {
    m_shooter_Motor.configVoltageCompSaturation(10); //Configures the Voltage Compensation saturation voltage.
    m_shooter_Motor.enableVoltageCompensation(true); //Enables voltage compensation. If enabled, voltage compensation works in all control modes.Be sure to configure the saturation voltage before enabling this.
  }

  @Override
  public void periodic() {
  }

  public void shoot() { //shootlama koşulu
    if(!shooter_state){
      shoot_Start();
      shooter_state = true;
    }
    else {
      shoot_Stop();
      shooter_state = false;
    }
    
  }

  public void shoot_Start() {  //shoot startı verir
    m_shooter_Motor.set(ControlMode.Velocity, ShooterConstants.kShooter_Target_PPS); //anlamadım

  }

  public void shoot_Stop() { //shooter motoru durdurur
    m_shooter_Motor.set(0);
  }

  public boolean shooter_Is_Ready() { //shooter'ın ne zaman hazır olduğunu verir
    double shooter_vel = m_shooter_Motor.getSelectedSensorVelocity(); //Get the selected sensor velocity.
    if(shooter_vel > ShooterConstants.kShooter_Target_PPS-ShooterConstants.kShooter_Tolerance 
    && shooter_vel < ShooterConstants.kShooter_Target_PPS+ShooterConstants.kShooter_Tolerance){
      System.out.println(true);
      return true;
    }
    else {
      return false;
    }
    
  }
  



}