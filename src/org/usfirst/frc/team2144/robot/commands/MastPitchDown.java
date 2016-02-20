package org.usfirst.frc.team2144.robot.commands;

import org.usfirst.frc.team2144.robot.Constants;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MastPitchDown extends CommandBase {

	public MastPitchDown() {
		// Use requires() here to declare subsystem dependencies
		requires(mastPitch);
		requires(intakePitch);
		setTimeout(4);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		mastPitch.enable();
		intakePitch.setSetpoint(Constants.actHalfDown);
		Timer.delay(Constants.mastPitchDelay);
		mastPitch.setSetpoint(Constants.mastPitchDown);
		Timer.delay(0.2);
		mastPitch.disable();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return mastPitch.get_encoder() >= Constants.mastPitchDown - 2;
	}

	// Called once after isFinished returns true
	protected void end() {
		intakePitch.setSetpoint(Constants.actUp);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
