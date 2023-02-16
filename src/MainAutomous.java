import java.util.ArrayList;

import utils.Arm;
import utils.Movement;
import utils.Grabber;

public class MainAutomous {

    public void SpecialTimerFunction(Movement movement, Arm arm, Grabber grabber) {
        System.out.println("Running in special timer function");

        movement.moveForward();
        movement.moveForward();
        movement.moveForward();

        movement.moveRight();
        movement.moveRight();
        movement.moveRight();

        arm.armMoveUp();
        arm.armMoveUp();

        grabber.grabberOpen();
        grabber.grabberClose();

        movement.moveBackward();
        movement.moveBackward();
        movement.moveRight();
        movement.moveRight();
        
        grabber.grabberOpen();

    }
    public static void main(String[] args) {
        // Initializing movement motors
        ArrayList<String> list = new ArrayList<>();
        list.add("Motor 1 - frontR");
        list.add("Motor 2 - frontL");
        list.add("Motor 3 - backR");
        list.add("Motor 4 - backL");
        Movement movement = new Movement(list);

        // Initializing arm motors
        String armMotor1 = "armMotor1";
        String armMotor2 = "armMotor2";
        Arm arm = new Arm(armMotor1, armMotor2);

        // Initializing grabber motors
        String grabberMotor1 = "grabberMotor1";
        String grabberMotor2 = "grabberMotor2";
        Grabber grabber = new Grabber(grabberMotor1, grabberMotor2);
        

        // Calling the special function that denotes time for auto mode
        MainAutomous mainAuto = new MainAutomous();
        mainAuto.SpecialTimerFunction(movement, arm, grabber);
    }
    
}
