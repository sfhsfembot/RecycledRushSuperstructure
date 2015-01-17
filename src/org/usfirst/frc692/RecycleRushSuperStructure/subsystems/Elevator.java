// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.RecycleRushSuperStructure.subsystems;

import org.usfirst.frc692.RecycleRushSuperStructure.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.SpeedController;

import org.usfirst.frc692.RecycleRushSuperStructure.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Elevator extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput elevatorLevelTopLoadLimit = RobotMap.elevatorelevatorLevelTopLoadLimit;
    DigitalInput elevatorLevelStepLimit = RobotMap.elevatorelevatorLevelStepLimit;
    SpeedController elevatorPlatformUpDownMotor = RobotMap.elevatorelevatorPlatformUpDownMotor;
    DoubleSolenoid flapperRelease = RobotMap.elevatorflapperRelease;
    DoubleSolenoid backStopRelease = RobotMap.elevatorbackStopRelease;
    DigitalInput elevatorLevelGroundLimit = RobotMap.elevatorelevatorLevelGroundLimit;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void releaseFlap()
    {
    	flapperRelease.set(Value.kForward);
    }
    // causes flapper to release totes
    // EV 1/15/2015
    
    public void backstopUp()
    {
    	backStopRelease.set(Value.kForward);
    }
    // causes backstop to go up
    // ND 1/15/2015
    
    public void backstopDown()
    {
    	backStopRelease.set(Value.kReverse);
    }
    // causes backstop to go down
    // ND 1/15/2015
    
    public boolean onGroundFloor()
    {
    	if(elevatorLevelGroundLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    //returns true when pressed
    //indicates whether platform is on ground level
    //when pressed elevator stops
    //AC 1/15/15
    
    public boolean onStepLevel()
    {
    	if(elevatorLevelStepLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    //returns true when pressed
    //indicates whether platform is on step level
    //when pressed elevator stops
    //AC 1/16/15
    
    public boolean onTopLoadLevel()
    {
    	if(elevatorLevelStepLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    //returns true when pressed
    //when pressed elevator stops
    //indicates whether platform is on topLoad level
    //AC 1/16/15
    
    public void elevatorUp()
    {
    	elevatorPlatformUpDownMotor.set(1.0);
    }
    //elevator goes up when called at 100% speed
    //AC 1/16/15
    
    public void elevatorDown()
    {
    	elevatorPlatformUpDownMotor.set(-1.0);
    }
    //elevator platform goes down at 100% speed
    //AC 1/16/15
    
    public void elevatorStop()
    {
    	elevatorPlatformUpDownMotor.set(0.0);
    }
    //elevator platform stops
    //AC 1/16/15
    
    /*
     * Elevator Steps(Top --> Bottom):
     * Top Load
     * Step
     * Ground
     * AC 1/16/15
     */
  
}
