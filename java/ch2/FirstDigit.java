package ch2;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(getFirstDigitLog(num));
    }
    public static int getFirstDigit(int num) {
        // O(len(num))
        int digit = 0;
        while (num>0) {
            digit = num%10;
            num = num/10;
        }
        return digit;
    }  

    public static int getFirstDigitLog(int num) {
        // O(1)
        double power = Math.log10(num);
        int powerInt = (int) power;
        int divisor = (int) Math.pow(10, powerInt);
        int ans = num/divisor;
        return ans;
    }
}
