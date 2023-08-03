package ch4;

import java.math.BigInteger;

public class BigIntIntro {
    // BigInteger is a class in the java.math package. It is used to represent integers of arbitrary size.
    public static void main(String[] args) {
        System.out.println(initialization());
    }

    public static BigInteger initialization() {
        BigInteger a = new BigInteger("100");
        String s = "100000";
        BigInteger b = new BigInteger(s);
        int n = 10;
        BigInteger c = BigInteger.valueOf(n);
        return a;
    }

    public static BigInteger methods() {
        // BigInteger has methods for all the arithmetic operations. Some common methods are:
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("200");
        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);
        BigInteger f = a.remainder(b);
        BigInteger j = a.subtract(b);
        BigInteger k = a.divide(b);
        BigInteger l = a.max(b);
        BigInteger m = a.min(b);
        int n = a.compareTo(b);
        int o = a.intValue();
        long q = a.longValue();
        String p = a.toString();
        return a;
    }
}
