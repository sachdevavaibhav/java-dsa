package ch3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        // a b c b a, a b b a
        int ptr1 = 0;
        int ptr2 = str.length()-1;
        while (ptr2>=ptr1) {
            if (str.charAt(ptr1) != str.charAt(ptr2)) return false;
            else {
                ptr1++;
                ptr2--;
            }
        }
        return true;
    }
}
