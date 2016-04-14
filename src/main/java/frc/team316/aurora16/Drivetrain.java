package frc.team316.aurora16;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * Drivetrain contains all the code related to driving the robot. <br>
 * Right now it only abstracts a few methods to make teleop more readable.
 * @author Christian
 *
 */
public class Drivetrain {
	
	Victor rearLeft = new Victor(2);
    Victor rearRight = new Victor(1);
    Victor frontLeft = new Victor(3);
    Victor frontRight = new Victor(0);
    RobotDrive driveMotors = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
    Joystick driveStick = new Joystick(1);
    
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
		driveMotors.arcadeDrive(move, turn);
	}
}
