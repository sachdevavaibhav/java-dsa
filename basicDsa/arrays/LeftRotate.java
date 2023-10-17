package basicDsa.arrays;

import java.util.Arrays;

public class LeftRotate {
    public static int[] reverse(int[] arr, int start, int end) {
        // reverse the array
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    };

    public static int[] leftRotate(int[] arr, int d) {
        // left rotate by d
        arr = reverse(arr, 0, d-1);
        arr = reverse(arr, d, arr.length-1);
        arr = reverse(arr, 0, arr.length-1);
        return arr;
    };
    public static void main(String[] args) {
        /* Problem Left rotate an array by d.
         * Approach 1: Run left rotate by 1 d times - Time: O(d*n), Aux Space: O(1)
         * Approach 2: Create a copy of first d elements in a separate array then swap the rest accordingly - Time: O(n) Space: O(d)
         * Approach 3: Reversal approach=> reverse d elements, reverse rest elements and then reverse whole array. - Time: O(n) Space: O(1)
         */
        int[] test1 = {10, 20, 30, 35, 95};
        int[] test2 = {8, 5, 0, 10, 0, 0, 0, 12, 3, 0};

        System.out.println(Arrays.toString(leftRotate(test1, 2)));
        System.out.println(Arrays.toString(leftRotate(test2, 5)));
    }
}
