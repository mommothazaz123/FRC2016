package org.usfirst.frc.team2144.robot.commands;

import org.usfirst.frc.team2144.robot.Constants;

/**
 *
 */
public class WinchDrive extends CommandBase {

	public WinchDrive() {
		// Use requires() here to declare subsystem dependencies
		requires(winch);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (oi.getWinch()) {
			winch.drive(Constants.winchSpeed);
		} else {
			winch.drive(0);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
