package ch2;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2  = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        int largestNum = num1;
        if (num1 < num2) {
            largestNum = num2;
        }
        if (num2<num3) {
            largestNum = num3;
        }
        System.out.println(largestNum);
    }
}