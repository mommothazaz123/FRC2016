package org.usfirst.frc.team2144.robot.commands;

import org.usfirst.frc.team2144.robot.Constants;

/**
 *
 */
public class AutoIntakeDrive extends CommandBase {

	double pos;

	/**
	 * When active, runs PID loop to move intakePitch to given position. Please
	 * use Constants to declare pos.
	 * 
	 * @param position
	 * @see org.usfirst.frc.team2144.robot.Constants
	 */
	public AutoIntakeDrive(double position) {
		// Use requires() here to declare subsystem dependencies
		requires(intakePitch);
		pos = position;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		intakePitch.enable();
		if (pos >= Constants.actUp && pos <= Constants.actDown) {
			intakePitch.setSetpoint(pos);
		} else {
			throw new IllegalArgumentException("Position is outside of possible range.");
		}

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

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
		end();
	}
}
