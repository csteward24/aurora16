/**
 * 
 */
package frc.team316.aurora16;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;
/**
 * Contains variables and methods related to the arm. 
 * @author Christian
 *
 */
public class Arm {
	
	private Victor pickupArm = new Victor(4);
	CANTalon roller = new CANTalon(3);
	DigitalInput bottomSwitch = new DigitalInput(1);
	DigitalInput topSwitch = new DigitalInput(2);
	AnalogInput pickupPot = new AnalogInput(1);
	Boolean override = false;
	
	//constructor
	Arm(){
	}
	
	public void pickupUp(){
		if (!topSwitch.get() || override){
			pickupArm.set(1);
		}
	}
	
	public void pickupDown(){
		if (!bottomSwitch.get() || override){
			pickupArm.set(-1);
		}
	}
	
	public void stopPickup(){
		pickupArm.set(0);
	}
	
	public void setRoller(double speed){
		roller.set(speed);
	}
	//public setOverride(){
		
	//}
}
