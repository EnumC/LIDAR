package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	
	@Override
	protected void initialize() {
		requires(Robot.driveTrain);
	}

	@Override
	protected void execute() {
		if(Robot.input.stop())
			Robot.driveTrain.stop();
		else if(Robot.input.forward())
			Robot.driveTrain.goForward();
		else if(Robot.input.backward())
			Robot.driveTrain.goBackward();
		else if(Robot.input.left())
			Robot.driveTrain.turnLeft();
		else if(Robot.input.right())
			Robot.driveTrain.turnRight();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
