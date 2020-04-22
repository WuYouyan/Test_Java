import java.io.IOException;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) throws IOException {
        /*TEST of Java！！！*/
        BigInteger bi = new BigInteger("1");
        bi.add(new BigInteger("1")); //return 2 the sum
        System.out.println(bi); // 1 bi's value is not changed

    }
}

