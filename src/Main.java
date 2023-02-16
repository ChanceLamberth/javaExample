import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Motor 1 - frontR");
        list.add("Motor 2 - frontL");
        list.add("Motor 3 - backR");
        list.add("Motor 4 - backL");

        Movement movement = new Movement(list);
        System.out.println();
        movement.moveForward();

        System.out.println();
    }
}
