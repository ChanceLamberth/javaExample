package utils;
import Interfaces.ArmMovement;

public class Arm implements ArmMovement {
    String motor1;
    String motor2;

    public Arm(String armMotor1, String armMotor2) {
        setArmMotors(armMotor1 ,armMotor2);
    }

    private void setArmMotors(String armMotor1, String armMotor2) {
        motor1 = armMotor1;
        motor2 = armMotor2;

    }

    @Override
    public void armMoveUp() {
        System.out.println("\nArm is moving up!");
        System.out.println("We are using motor: {" + motor1 + "} to go up");
        System.out.println("We are using motor: {" + motor2 + "} to go up\n");
        
    }

    @Override
    public void armMoveDown() {
        System.out.println("\nArm is moving Down");
        System.out.println("We are using motor: {" + motor1 + "} to go down");
        System.out.println("We are using motor: {" + motor2 + "} to go down\n");
        
    }
    
}
