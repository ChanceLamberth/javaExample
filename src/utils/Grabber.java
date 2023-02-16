package utils;
public class Grabber implements Interfaces.Grabber{
    String motor1;
    String motor2;

    public Grabber(String grabberMotor1, String grabberMotor2) {
        setGrabberMotors(grabberMotor1, grabberMotor2);

    }

    private void setGrabberMotors(String grabberMotor1, String grabberMotor2) {
        motor1 = grabberMotor1;
        motor2 = grabberMotor2;
    }

    @Override
    public void grabberOpen() {
        System.out.println("\nGrabber is opening!");
        System.out.println("We are using motor: {" + motor1 + "} to grab");
        System.out.println("We are using motor: {" + motor2 + "} to grab\n");        
    }

    @Override
    public void grabberClose() {
        System.out.println("\nGrabber is closing!");
        System.out.println("We are using motor: {" + motor1 + "} to grab");
        System.out.println("We are using motor: {" + motor2 + "} to grab\n");        
    }    
}
