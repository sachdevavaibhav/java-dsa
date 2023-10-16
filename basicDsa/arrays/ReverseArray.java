package basicDsa.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        };

        return arr;
    }
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 35, 95};
        int[] test2 = {20, 10, 5, 8, 20};
        int[] test3 = {10, 10, 10, 10};
        int[] test4 = {10, 5, 35, 90};

        System.out.println(Arrays.toString(reverse(test1)));
        System.out.println(Arrays.toString(reverse(test2)));
        System.out.println(Arrays.toString(reverse(test3)));
        System.out.println(Arrays.toString(reverse(test4)));
    }
}
