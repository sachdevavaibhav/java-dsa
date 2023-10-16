package basicDsa.arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] arr) {
        // works for non sorted arrays as well
        // Time Complexity - O(n)
        // Aux Space Complexity - O(1)
        if (arr.length <=0) return 0;
        int size = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[size-1] != arr[i]) {
                arr[size] = arr[i];
                size++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return size;
    }
    public static void main(String[] args) {
        int[] test1 = {10,20,20,30,30,30,90};
        int[] test2 = {10,10,10};
        int[] test3 = {};
        int[] test4 = {10, 5, 5, 35, 90}; // soln works for non sorted arrays as well
        System.out.println(removeDuplicate(test1));
        System.out.println(removeDuplicate(test2));
        System.out.println(removeDuplicate(test3));
        System.out.println(removeDuplicate(test4));
    }
}
