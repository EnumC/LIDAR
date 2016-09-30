package org.usfirst.frc.team115.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Input extends Subsystem {

	private DigitalInput forward, backward, left, right, stop;
	
	public boolean forward() {
		return forward.get();
	}
	
	public boolean backward() {
		return backward.get();
	}
	
	public boolean left() {
		return left.get();
	}
	
	public boolean right() {
		return right.get();
	}
	
	public boolean stop() {
		return stop.get();
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
