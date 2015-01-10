package com.team1168robotics;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Joystick;

/**
 * Xbox controller axis index:
 * 
 * LeftY: 2
 * LeftX: 1
 * RightY: 5
 * RightX: 4
 * D-Pad: 6
 * Triggers: 3
 * 
 * Button index:
 * 
 * A: 1
 * B: 2
 * X: 3
 * Y: 4
 * LB: 5
 * RB: 6
 * Back: 7
 * Start: 8
 * LS: 9
 * RS: 10
 */
public class Main extends SimpleRobot {
    
    private Joystick controller;
   
    /**
     * This function is called exactly once when the competition starts
     */
    protected void robotInit() {
        Drive.init();
        controller = new Joystick(1);
    }
    
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        Drive.driveSys(controller);
    }
    
    
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
