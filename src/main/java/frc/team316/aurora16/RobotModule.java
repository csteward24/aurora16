package frc.team316.aurora16;

import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;
import frc.team316.aurora16.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;


public class RobotModule extends IterativeModule {

    public static Logger logger;
    Drivetrain drivetrain = new Drivetrain();
    Arm arm = new Arm();
    Joystick driveStick = new Joystick(0);
    Joystick operatorStick = new Joystick(1);
    
    @Override
    public String getModuleName() {
        return "aurora16";
    }

    @Override
    public String getModuleVersion() {
        return "0.0.1";
    }

    @Override
    public void robotInit() {
        logger = new Logger("aurora16", Logger.ATTR_DEFAULT);
        //TODO: Module Init
        logger.info("Hello World");
    }
    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	drivetrain.arcadeDrive(driveStick.getRawAxis(1), driveStick.getRawAxis(0));
    	if (driveStick.getRawButton(5)){
    		arm.pickupDown();
    	}
    	if (driveStick.getRawButton(6)){
    		arm.pickupUp();
    	}
    	if (!driveStick.getRawButton(5) && !driveStick.getRawButton(6)){
    		arm.stopPickup();
    	}
    	
    	arm.setRoller(driveStick.getRawAxis(5));
  
    }
    
}
