package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;
import org.usfirst.frc.team115.robot.commands.Drive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	//private RobotDrive drive;
	private CANTalon frontLeft;
	private CANTalon frontRight;
	private CANTalon backLeft;
	private CANTalon backRight;
	
	public DriveTrain() {
		frontLeft = new CANTalon(RobotMap.kFrontLeft);
		frontRight = new CANTalon(RobotMap.kFrontRight);
		//drive = new RobotDrive(frontLeft, frontRight);
		
		backLeft = new CANTalon(RobotMap.kBackLeft);
		backRight = new CANTalon(RobotMap.kBackRight);
		backLeft.changeControlMode(TalonControlMode.Follower);
		backRight.changeControlMode(TalonControlMode.Follower);
		backLeft.set(RobotMap.kFrontLeft);
		backRight.set(RobotMap.kFrontRight);
		
		
	}
	
	public void goForward() {
		frontLeft.set(1);
		frontRight.set(1);
	}
	
	public void goBackward() {
		frontLeft.set(-1);
		frontRight.set(-1);
	}
	
	public void turnLeft() {
		frontLeft.set(-1);
		frontRight.set(1);
	}
	
	public void turnRight() {
		frontLeft.set(1);
		frontRight.set(-1);
	}
	
	public void stop() {
		frontLeft.set(0);
		frontRight.set(0);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new Drive());

	}

}
