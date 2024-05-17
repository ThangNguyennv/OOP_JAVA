package lab5.biginteger;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        String stringOne = "11111111111111111111111111111111111111111111111111111111111111";
        String stringTwo = "22222222222222222222222222222222222222222222222222";
        BigInteger i1 = new BigInteger(stringOne);
        BigInteger i2 = new BigInteger(stringTwo);
        System.out.println(i1.add(i2));
        System.out.println(i1.multiply(i2));
    }
}
