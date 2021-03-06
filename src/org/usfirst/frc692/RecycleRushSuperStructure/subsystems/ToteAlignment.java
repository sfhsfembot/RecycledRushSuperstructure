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
import org.usfirst.frc692.RecycleRushSuperStructure.commands.*;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ToteAlignment extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController rotatingAlignmentMotor = RobotMap.toteAlignmentrotatingAlignmentMotor;
    DigitalInput rightTopAlignmentLimit = RobotMap.toteAlignmentrightTopAlignmentLimit;
    DigitalInput rightMiddleAlignmentLimit = RobotMap.toteAlignmentrightMiddleAlignmentLimit;
    DigitalInput leftMiddleAlignmentLimit = RobotMap.toteAlignmentleftMiddleAlignmentLimit;
    DigitalInput leftBottomAlignmentLimit = RobotMap.toteAlignmentleftBottomAlignmentLimit;
    DigitalInput suctionCupAlignmentLimiit = RobotMap.toteAlignmentsuctionCupAlignmentLimiit;
    DigitalInput leftTopAlignmentLimit = RobotMap.toteAlignmentleftTopAlignmentLimit;
    DigitalInput rightBottomAlignmentLimit = RobotMap.toteAlignmentrightBottomAlignmentLimit;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    /*
     * is instantiated as a limit switch but controls an infrared sensor
     * hasn't been tested so let's just say .get = true = something in front 
     * .get = false = nothing in front 
     * return true = code run
     * AC 1/17/15
     */
   
    public boolean detectToteTopRight()
    {
    	if(rightTopAlignmentLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean detectToteRightMiddle()
    {
    	if(rightMiddleAlignmentLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean detectToteRightBottom()
    {
    	if(rightBottomAlignmentLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean detectToteTopLeft()
    {
    	if(leftTopAlignmentLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean detectToteMiddleLeft()
    {
    	if(leftMiddleAlignmentLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean detectToteBottomLeft()
    {
    	if(leftBottomAlignmentLimit.get() == true)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean alignedLeft()
    {
    	if(leftBottomAlignmentLimit.get() && leftMiddleAlignmentLimit.get() && leftTopAlignmentLimit.get() == false)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    //if three limit switches on one side are not pressed, it is aligned
    //checks to see if left side is aligned
    //AC 1/19/15
    
    public boolean alignedRight()
    {
    	if(rightBottomAlignmentLimit.get() && rightMiddleAlignmentLimit.get() && rightTopAlignmentLimit.get() == false)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    //if three limit switches on one side are not pressed, it is aligned
    //checks to see if right side is aligned
    //AC 1/19/15
    
    public void alignmentMotorTurnRight()
    {
    	rotatingAlignmentMotor.set(0.5);
    }
    
    public void alignmentMotorTurnLeft()
    {
    	rotatingAlignmentMotor.set(-0.5);
    }
    
    /*
     * PLAN FOR TOTE ALIGNMENT:
     * -6 sensors that detect if tote is there 
     * -uses sensors to see if should rotate CCW or CW 
     * turns until 3 sensors are not pressed anymore
     * AC 1/17/15
     */
}
