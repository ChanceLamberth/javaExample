import java.util.ArrayList;

public class Movement implements Interfaces.Movement{
    String motor1;
    String motor2;
    String motor3;
    String motor4;

    public Movement(ArrayList<String> motorList) {
        setMotors(motorList);
    }

    private void setMotors(ArrayList<String> motorList) {
        motor1 = motorList.get(0);
        motor2 = motorList.get(1);
        motor3 = motorList.get(2);
        motor4 = motorList.get(3);
    }
    @Override
    public void moveRight() {
        System.out.println("We are moving right");
        System.out.println("We are using motor named: " + motor1);
        System.out.println("We are using motor named: " + motor2);
    }

    @Override
    public void moveLeft() {
        System.out.println("We are moving left");
        System.out.println("We are using motor named: " + motor3);
        System.out.println("We are using motor named: " + motor4);
    }

    @Override
    public void moveForward() {
        System.out.println("We are moving forward");
        System.out.println("We are using motor named: " + motor1);
        System.out.println("We are using motor named: " + motor2);
        System.out.println("We are using motor named: " + motor3);
        System.out.println("We are using motor named: " + motor4);
    }

    @Override
    public void moveBackward() {
        System.out.println("We are moving backwards");
        System.out.println("We are using motor named: " + motor1);
        System.out.println("We are using motor named: " + motor2);
        System.out.println("We are using motor named: " + motor3);
        System.out.println("We are using motor named: " + motor4);
    }

    @Override
    public void rotateRight() {
        System.out.println("We are rotating right");
        System.out.println("We are using motor named: " + motor1);
        System.out.println("We are using motor named: " + motor3);
    }

    @Override
    public void rotateLeft() {
        System.out.println("We are rotating left");
        System.out.println("We are using motor named: " + motor2);
        System.out.println("We are using motor named: " + motor4);        
    }   
}
