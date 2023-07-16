package ch3;

import java.util.Scanner;

public class MaxInArray {
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
        int maxInt = max(arr);
        System.out.println(maxInt); 
    }
    public static int max(int[] arr) {
        // [3, 9, 1, 2]
        int maxInt = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num>maxInt) {
                maxInt = num;
            }
        }
        return maxInt;
    }
}
