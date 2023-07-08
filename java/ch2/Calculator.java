package ch2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Select an operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.print("Select an operation from 1,2 or 3: ");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
