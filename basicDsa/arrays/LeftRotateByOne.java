package basicDsa.arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static int[] leftRotateByOne(int[] arr) {
        // Time Complexity - O(n)
        // Aux Space Complexity - O(1)
        int firstElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = firstElement;
        return arr;
    }
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 35, 95};
        int[] test2 = {20, 10, 5, 8, 20};
        int[] test3 = {10, 10, 10, 10};
        int[] test4 = {10, 5, 35, 90};

        System.out.println(Arrays.toString(leftRotateByOne(test1)));
        System.out.println(Arrays.toString(leftRotateByOne(test2)));
        System.out.println(Arrays.toString(leftRotateByOne(test3)));
        System.out.println(Arrays.toString(leftRotateByOne(test4)));
    }
}
