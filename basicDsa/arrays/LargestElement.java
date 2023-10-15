package basicDsa.arrays;

public class LargestElement {
    public static int findLargest(int[] arr) {
        // Time Complexity : O(n) - since the whole array is traversed atmost once.
        // Auxillary Space Complexity: O(1)
        int largestElement = arr[0];
        for (int i=1; i<arr.length;i++) {
            if (arr[i]>largestElement) largestElement = arr[i];
        }
        return largestElement;
    }
    public static void main(String[] args) {
        int[] testArr = {30, 5, 20, 7};
        System.out.println(findLargest(testArr));
    }
}
