package ch3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for (int i=0; i < arr.length; i++) {
            System.out.print("Enter array integer: ");
            int arrItem = sc.nextInt();
            arr[i] = arrItem;
        }
        sc.close();
        int sum = sumArray(arr);
        double average = (double)sum/n;
        System.out.printf("Average is: %.2f%n", average);    
    }

    public static int sumArray(int[] arr) {
        int ans=0;
        for (int item: arr) {
            ans+=item;
        }
        return ans;
    }

}