package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveForward extends Command {

	@Override
	protected void initialize() {
		requires(Robot.driveTrain);
	}

	@Override
	protected void execute() {
		Robot.driveTrain.goForward();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {

	}

}
