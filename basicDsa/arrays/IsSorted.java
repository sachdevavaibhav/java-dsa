package basicDsa.arrays;

public class IsSorted {
    public static boolean isSorted(int[] arr) {
        // returs if the array is sorted or not in increasing order - can be implemented in O(n) using two pointers
        // Time Complexity - O(n)
        // Auxillary Space Complexity - O(1)
        int i = 0;

        for (int j=1; j<arr.length;j++) {
            if (arr[i] > arr[j]) return false;
            i++;
        };

        return true;
    }
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 35, 95};
        int[] test2 = {10, 20, 35, 30, 95};
        int[] test3 = {10, 10, 10, 10};
        System.out.println(isSorted(test1));
        System.out.println(isSorted(test2));
        System.out.println(isSorted(test3));
    };
}
