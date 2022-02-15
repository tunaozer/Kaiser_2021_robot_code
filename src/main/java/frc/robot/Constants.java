/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.controller.SimpleMotorFeedforward; //A helper class that computes feedforward outputs for a simple permanent-magnet DC motor.
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics; //Helper class that converts a chassis velocity (dx and dtheta components) to left and right wheel velocities for a differential drive.Inverse kinematics converts a desired chassis speed into left and right velocity components whereas forward kinematics converts left and right component velocities into a linear and angular chassis speed.


/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants { 
    public static final class DriveConstants { //sürüş constantları

        public static final int kLeft_Master_Port = 2;      
        public static final int kLeft_Slave_Port = 18;
        public static final int kRight_Master_Port = 7;         //todo find all motor ports
        public static final int kRight_Slave_Port = 1;

        public static final boolean kGyro_Reversed = true;

        public static final double kP = 2;   
        public static final double kI = 0;               //todo find pid parameters
        public static final double kD = 0.15; 
        public static final double kMin_Command = 0.07;

        public static final double kSpeed_Slew_Rate_Limit = 2;  //hiç anlamadım
        public static final double kRotate_Slew_Rate_Limit = 2;
        public static final double kOpen_Loop_Ramp = 0.10;

        public static final double kMax_Turn_Rate_Deg_PerS = 1;
        public static final double kMax_Turn_Acceleration_Deg_PerSSquared = 300;        //

        public static final double kTurn_Tolerance_Deg = 2;
        public static final double kTurn_Rate_Tolerance_DegPerS = 8; // 10

        public static final double kS = 0.69;     //static gain                     
        public static final double kV = 3.3;   //velocity gain              
        public static final double kA = 0.85;   //acceleration gain

        public static final double kWheel_Diameter_Meters = 0.1524;
        public static final double kWheel_Circumference_Meters = 0.4787;
        public static final double kDrive_Vel = 5;                  
        public static final double kTrack_Width_Meters = 0.65;                        //todo drive characterisation
        public static final double kMax_Speed_Meters_Per_Second = 2.5; 
        public static final double kMax_Acceleration_Meters_Per_Second_Squared = 1.5; 

        public static final double kRamsete_B = 3;     ///3 /// 1.5
        public static final double kRamsete_Zeta = 1.5; //bunlar default olarak verilen değerler

        public static final double kEncoder_CPR = 4096;   //encoder'ın üzerinde bulunabilir info sanırım

        public static final DifferentialDriveKinematics kDrive_Kinematics = new DifferentialDriveKinematics(
                DriveConstants.kTrack_Width_Meters);

        public static final SimpleMotorFeedforward FEED_FORWARD = new SimpleMotorFeedforward(DriveConstants.kS, DriveConstants.kV, DriveConstants.kA); // A helper class that computes feedforward outputs for a simple permanent-magnet DC motor. //ks: The static gain.// kv: The velocity gain.// ka The acceleration gain.



    }

    public static final class ShooterConstants {  //shooter constanları
        public static final int kShooter_Motor_Port = 0;                               //to do find motor ports
 
        public static final int kShooter_Target_PPS = -13400; //hiç anlamadım
        public static final int kShooter_Tolerance = 60; //hiç anlamadım

    }

    public static final class IndexerConstants {  //indexer constantları
        public static final int kIndexer_Motor_Port = 3;                                 //todo

        public static final double kIndexer_Motor_speed = 0.3;
    }

    public static final class IntakeConstants  {   //intake constantları
        public static final int kIntake_Motor_Port = 30;

        public static final int kIntake_Solenoid_port = 0;    //bu ne?                          //todo

        public static final double kIntake_Motor_speed = 1;
    }


    public static final class ClimberConstants {  //climber constanları
        public static final int kClimber_Elevator_Motor_Port = 38;
        public static final int kClimber_Winch_Motor_Port = 37;                          //todo

        
    }
}