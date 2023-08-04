package ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));
    }

    public static boolean isPrime(int n) {
        BigInteger bigInt = BigInteger.valueOf(n);
        return bigInt.isProbablePrime(1);
    }

    public static int nextPrime(int n) {
        BigInteger bigInt = BigInteger.valueOf(n);
        int nextPrime = bigInt.nextProbablePrime().intValue();
        return nextPrime;
    }
}
