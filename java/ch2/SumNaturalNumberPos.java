package ch2;
import java.util.Scanner;

public class SumNaturalNumberPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        
        int sum = (num*(num+1))/2;
        System.out.println(sum);
        
    }    
}
