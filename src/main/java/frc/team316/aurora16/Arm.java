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
	
	Victor pickupArm = new Victor(4);
	CANTalon roller = new CANTalon(3);
	DigitalInput bottomSwitch = new DigitalInput(1);
	DigitalInput topSwitch = new DigitalInput(2);
	AnalogInput pickupPot = new AnalogInput(1);
	//constructor
	Arm(){
	}
	
	
}
