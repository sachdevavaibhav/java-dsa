package ch2;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while (i<n) {
            int j=0;
            while (j < (n-1-i)) {
                System.out.print(" ");
                j++;
            } 
            int k=0;
            while (k<(2*i+1)) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
