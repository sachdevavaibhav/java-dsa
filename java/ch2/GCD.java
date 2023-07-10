package ch2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int minInt = Math.min(a, b);
        int ans = 1;
        int i=1;
        while (i<=minInt) {
            if (a%i==0 && b%i==0) {
                ans = i;
            }
            i++;
        }
        System.out.println(ans);
    }
}
