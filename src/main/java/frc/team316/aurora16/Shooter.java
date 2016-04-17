/**
 * 
 */
package frc.team316.aurora16;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Counter;

/**
 * @author Christian
 *
 */
public class Shooter {
	
	CANTalon flywheelTalon = new CANTalon(2);
	CANTalon angleTalon = new CANTalon(1);
	Talon shooterCam = new Talon(5);
	Counter rpmCounter = new Counter(0);
	
	//constructor
	public void shooter() {
	}
	
	
}
