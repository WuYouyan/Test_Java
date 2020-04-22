import java.io.IOException;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        /*TEST of Java！！！*/
        HashMap a = new HashMap<>();
        Object o1 = new Object();
        Object o2 = o1;
        a.put(o1,1);
        a.put(o2,2);
        System.out.println(a.get(o1)); // 2

    }
}

