package ch2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num%2 == 0) {
            // if divisible by 2 then it is even.
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
