/**
 * 
 */
package frc.team316.aurora16;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI.Port;
import jaci.openrio.toast.core.Environment;

/**
 * Custom gyro wrapper to deal with Toast simulation. 
 * When it detects that it is simulation, it feeds dummy values to the rest of the robot.
 * Right now it only sends 0 when it is being simulated.
 * @author Christian
 *
 */
public class LunaGyro extends ADXRS450_Gyro {
	
	ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	
	/**
	 * 
	 */
	public LunaGyro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param port
	 */
	public LunaGyro(Port port) {
		super(port);
		// TODO Auto-generated constructor stub
	}
	/**
	 * {@inheritDoc}
	 */
	public double getAngle(){
		if (Environment.isSimulation()){
			return 0;
		}
		else {
			return gyro.getAngle();
		}
	}
	/**
	 * {@inheritDoc}
	 */
	public double getRate(){
		if (Environment.isSimulation()){
			return 0;
		}
		else {
			return gyro.getRate();
		}
	}
	
	
}
