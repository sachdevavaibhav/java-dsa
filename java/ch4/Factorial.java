package ch4;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10000));
    }

    public static BigInteger factorial(int n) {
        BigInteger ans = new BigInteger("1");
        for (int i=2; i<=n; i++) {
            BigInteger x = BigInteger.valueOf(i);
            ans = ans.multiply(x);
        }
        return ans;
    }
}
