package org.usfirst.frc692.RecycleRushSuperStructure.commands;

import org.usfirst.frc692.RecycleRushSuperStructure.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Flapping extends Command {

    public Flapping() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.elevator.releaseFlap();
    	// releases flap
    	// EV 1/15/2015
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
