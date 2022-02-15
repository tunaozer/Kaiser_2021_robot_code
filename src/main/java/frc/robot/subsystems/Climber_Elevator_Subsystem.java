package frc.robot.subsystems;


import  com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimberConstants;




public class Climber_Elevator_Subsystem extends SubsystemBase {

    private final WPI_VictorSPX m_climber_elevator = new WPI_VictorSPX(ClimberConstants.kClimber_Elevator_Motor_Port); //victor'un hangi motor portta olduğunu gösterir


    public Climber_Elevator_Subsystem() {

    }

    public void periodic() {

    }

    public void elevator_Up(double speed) {
        m_climber_elevator.set(speed);
    }

    public void elevator_Stop() {
        m_climber_elevator.set(0);
    }



}
