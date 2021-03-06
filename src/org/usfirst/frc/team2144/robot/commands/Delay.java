package org.usfirst.frc.team2144.robot.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class Delay extends CommandBase {

	double sec, beginning;

	public Delay(double seconds) {
		sec = seconds;
		beginning = Timer.getFPGATimestamp();
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		if (Timer.getFPGATimestamp() >= beginning + sec) {
			return true;
		} else {
			return false;
		}
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
