package org.usfirst.frc.team20.robot.subsystem;

import org.usfirst.frc.team20.robot.Robot;
import org.usfirst.frc.team20.robot.Sensors;

public class RetractedTray implements ITray{

	@Override
	public void extend(double speed) {
		Robot.traySC.set(speed);
		
	}

	@Override
	public void retract(double speed) {
		//Leave Empty
		
	}

	@Override
	public void update() {
		if (!Sensors.trayRetractedSwitch.get()) {
			Robot.tray = new TrayMiddle();
		}
		
	}

}
