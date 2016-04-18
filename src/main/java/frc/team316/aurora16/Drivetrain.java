package frc.team316.aurora16;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
//import frc.team316.aurora16.LunaGyro;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
/**
 * Drivetrain contains all the code related to driving the robot. <br>
 * Right now it only abstracts a few methods to make teleop more readable.
 * @author Christian
 *
 */
public class Drivetrain {
	
	Talon rearLeft = new Talon(2);
    Talon rearRight = new Talon(1);
    Talon frontLeft = new Talon(3);
    Talon frontRight = new Talon(0);
    RobotDrive driveMotors = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
    Joystick driveStick = new Joystick(1);
    //ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    LunaGyro gyro = new LunaGyro();
    
    
	/**
	 * Default constructor
	 */
	Drivetrain(){
		
	}
	/**
	 * Single stick drive
	 * @param move forward and backward movement
	 * @param turn rotational movement
	 */
	public void arcadeDrive(double move, double turn) {
		//deadband
		if (move < .2 && move > -.2){
			move = 0;
		}
		if (turn < .2 && turn > -.2){
			turn = 0;
		}
		driveMotors.arcadeDrive(move, turn);
	}
}
