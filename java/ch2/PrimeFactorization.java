package ch2;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        printPrimeFactors(num);
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n==1) return false;
        int i=2;
        while (i*i <= n) {
            if (n%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void printPrimeFactors(int n) {
        for (int i=2; i<=n; i++) {
            if (isPrime(i)) {
                int divisor = i;
                while (n%divisor==0) {
                    if (n%divisor==0) {
                        System.out.print(i+" ");
                        divisor *= i;
                    }
                }
            }
        }
    }
}
