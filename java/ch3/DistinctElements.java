package ch3;

import java.util.Scanner;

public class DistinctElements {
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
        int distinctCount = countDistinct(arr)   ;
        System.out.println(distinctCount);
    }

    public static int countDistinct(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length;i++) {
            boolean isDuplicate=false;
            for (int j=0; j<i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }
        return count;
    }
}

// [10, 20, 10, 20, 30]
