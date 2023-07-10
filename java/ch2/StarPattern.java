package ch2;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i =0;
        while (i < n) {
            int j=0;
            while (j < n) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
