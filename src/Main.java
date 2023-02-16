import java.util.ArrayList;

import utils.Arm;
import utils.Grabber;
import utils.Movement;

public class Main {
    
    public static void main(String[] args) throws Exception {

        // Setting the motors to the ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Motor 1 - frontR");
        list.add("Motor 2 - frontL");
        list.add("Motor 3 - backR");
        list.add("Motor 4 - backL");

        // Passing the ArrayList to the movement class to initialize the motors
        Movement movement = new Movement(list);
        movement.moveForward(); // Pretending to move forward
        
        String armMotor1 = "armMotor1";
        String armMotor2 = "armMotor2";
        Arm arm = new Arm(armMotor1, armMotor2);
        arm.armMoveUp(); // Pretending to move arm up
        

        String grabberMotor1 = "grabberMotor1";
        String grabberMotor2 = "grabberMotor2";
        Grabber grabber = new Grabber(grabberMotor1, grabberMotor2);
        grabber.grabberOpen(); // pretending to open grabber

    }
}
