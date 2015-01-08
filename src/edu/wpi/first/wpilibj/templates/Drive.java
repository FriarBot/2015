package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;


/**
 * Xbox controller axis index:
 * LeftY: 0
 * LeftX: 1
 * RightY: 2
 * RightX: 3
 */
public class Drive {
    
    private static Talon rightF;
    private static Talon rightB;
    private static Talon leftF;
    private static Talon leftB;
    private static int driveSys;  
    
    public static void init(){
        rightF = new Talon(0);
        rightB = new Talon(1);
        leftF = new Talon(2);
        leftB = new Talon(3);
        driveSys = 0;
    }
    
    private static void mecanum(Joystick controller){
        double leftY = controller.getRawAxis(0);
        double rightX = controller.getRawAxis(3);
        double leftX = controller.getRawAxis(1);
        rightF.set(leftY - rightX - leftX);
        rightB.set(leftY - rightX + leftX);
        leftF.set(leftY + rightX + leftX);
        leftB.set(leftY + rightX - leftX);
    }
    
    private static void tank(Joystick controller) {
        double leftY = controller.getRawAxis(0);
        double rightY = controller.getRawAxis(2);
        rightF.set(rightY);
        rightB.set(leftY);
    }
    
    public static void driveSys(Joystick controller){
        if(controller.getRawButton(1)){
            driveSys++;
        }
        if(driveSys > 1){
            driveSys = 0;
        }
        driveOpt(controller);
    }
    
    private static void driveOpt(Joystick controller) {
        if(driveSys == 0){
            mecanum(controller);
        } else if (driveSys == 1) {
            tank(controller);
        }
    }
    
}
