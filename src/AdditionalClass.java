import java.util.ArrayList;

public class AdditionalClass {

    String m1;
    String m2;
    String m3;
    String m4;


    public AdditionalClass(ArrayList<String> a) {
        m1 = a.get(0);
        m2 = a.get(1);
        m3 = a.get(2);
        m4 = a.get(3);

    }

    public void Printm1() {
        System.out.println(m1);
    }

    
}