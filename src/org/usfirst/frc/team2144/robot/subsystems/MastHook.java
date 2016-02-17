package org.usfirst.frc.team2144.robot.subsystems;

import org.usfirst.frc.team2144.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MastHook extends Subsystem {

	Talon talon;
	Encoder encoder;

	public MastHook() {
		talon = new Talon(RobotMap.mastHookPort);
		encoder = new Encoder(RobotMap.mastHookEncA, RobotMap.mastHookEncB);
	}

	public void drive(double foo) {
		talon.set(foo);
	}

	public int get_encoder() {
		return encoder.get();
	}

	public void reset_encoder() {
		encoder.reset();
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
