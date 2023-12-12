import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger i = new BigInteger("1032897412308473490871234089123");
        BigInteger j = new BigInteger("1893740128934724");
        BigInteger z = new BigInteger("1");

        BigInteger k = i.multiply(j);

        System.out.println(k.toString());

        for (int l = 0; l < 10000000; l++) {
            k = z.multiply((i.multiply(j)));
            System.out.println(k.toString());
        }


    }
}