package ch2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        
        if (year%4 == 0 && year%100 !=0 ) {
            System.out.println("Leap Year");
        }
        else if (year%400 == 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap year");        
        }
    }
}

/*
 * leap year:
 * Rule1: Divisible by 4 but not divisible by 100.
 * Rule2: Divisible by 400.
 */