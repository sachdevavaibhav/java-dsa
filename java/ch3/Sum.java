package ch3;

import java.util.Scanner;

public class Sum {
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
        int sum = sumArray(n, arr);
        System.out.println(sum);    
    }

    public static int sumArray(int n, int[] arr) {
        int ans=0;
        for (int item: arr) {
            ans+=item;
        }
        return ans;
    }

}