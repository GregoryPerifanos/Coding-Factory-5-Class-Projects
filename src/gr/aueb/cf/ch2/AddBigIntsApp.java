package gr.aueb.cf.ch2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AddBigIntsApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("43814981723985555555555555555555555555555555");
        BigInteger bigNum2 = new BigInteger("2342423423423");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d\n", result);
    }
}
