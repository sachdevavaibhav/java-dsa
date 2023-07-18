package ch3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String result = "";
        int strIdx = str.length()-1;
        while (strIdx>=0) {
            result += str.charAt(strIdx);
            strIdx--;
        }
        return result;
    }
}
