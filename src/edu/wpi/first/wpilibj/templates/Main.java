package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Joystick;

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
