import java.io.IOException;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) throws IOException {
        /*TEST of Java！！！*/
        TreeMap t = new TreeMap();
        t.put(3,3);
        t.put(2,1);
        t.put(1,2);
        System.out.println(t.values()); // 2, 1, 3

    }
}

