package ch4;

import java.util.Scanner;
import java.math.BigInteger;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = fibbonaci(n);
        System.out.println(result);
        sc.close();
    }

    public static BigInteger fibbonaci(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        if (n==0) return a;
        if (n==1) return b;
        for (int i=2; i<=n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}
