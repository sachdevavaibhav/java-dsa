package ch3;

import java.util.Scanner;

public class IsSortedArray {
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
        boolean sorted = isSorted(arr);
        System.out.println(sorted);    
    }

    public static boolean isSorted(int[] arr) {
        if (arr.length==0 || arr.length==1) {
            return true;
        }
        boolean sorted = true;
        for (int i=0; i<arr.length-1;i++) {
            if (arr[i+1] < arr[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}
