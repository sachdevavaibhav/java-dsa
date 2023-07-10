package ch2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isNotPrime = false;
        sc.close();
        // Time Complexity: O(n)
        // if (num == 1) System.out.println("Not Prime");
        // for (int i=2; i<num; i++) {
        //     if (num%i==0) {
        //         isNotPrime = true;
        //         System.out.println("Not Prime");
        //         break;
        //     }
        // }
        // if (!isNotPrime) {
        //     System.out.println("Prime");
        // }

        // Approach-2: Time Complexity: O(n^1/2)
        // for (int i=2; i*i<num; i++) {
        //     if (num == 1) System.out.println("Not Prime");
        //     if (num%i==0) {
        //         isNotPrime = true;
        //         System.out.println("Not Prime");
        //         break;
        //     }
        // }
        // if (!isNotPrime) {
        //     System.out.println("Prime");
        // }

        // Approach-3: Time Complexity: O(n^1/2)
        for (int i=2; i*i<num; i+=6) {
            if (num == 1) {
                System.out.println("Not Prime");
                return;
            }
            if (num == 2 || num==3) {
                System.out.println("Prime");
                return;
            }
            if (num%2==0||num%3==0) {
                System.out.println("Not Prime");
                return;
            }
            if (num%i==0 || (num+2)%i==0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
