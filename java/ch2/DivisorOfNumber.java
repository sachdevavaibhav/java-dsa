package ch2;

import java.util.Scanner;

public class DivisorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        // Approach-1: O(n);
        // for (int i = 1; i <= a; i++) {
        //     if (a%i==0) {
        //         System.out.print(i+" ");
        //     }
        // }
        // System.out.println("");

        // Approach-2: O(n^(1/2)); (but not in sequence)
        // for (int i=1; i*i<=a; i++) {
        //     if (a%i==0) {
        //         System.out.print(i+" ");
        //         if (a/i != i) {
        //             System.out.print(a/i+" ");
        //         }
        //     }
        // }   
        // System.out.println("");

        // Approach-3: O(n^(1/2));
        int i;
        for (i=1; i*i<=a; i++) {
            if (a%i==0) {
                System.out.print(i+" ");
            }
        } 
        i--;
        for (;i>=1;i--) {
            if (a%i==0) {
                System.out.print(a/i+" ");
            }
        }  
        System.out.println("");
    }
}
