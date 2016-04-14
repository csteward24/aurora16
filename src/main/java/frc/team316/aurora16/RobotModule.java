package frc.team316.aurora16;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

public class RobotModule extends IterativeModule {

    public static Logger logger;
    
    Victor rearLeft = new Victor(2);
    Victor rearRight = new Victor(1);
    Victor frontLeft = new Victor(3);
    Victor frontRight = new Victor(0);
    RobotDrive driveMotors = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
    Joystick driveStick = new Joystick(1);

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
        //driveMotors.arcadeDrive(driveStick.getRawAxis(1), driveStick.getRawAxis(0));
    	driveMotors.arcadeDrive(1, .5);
    }
}
