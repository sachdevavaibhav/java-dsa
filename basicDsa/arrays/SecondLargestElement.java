package basicDsa.arrays;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        // returns the largest element
        // Time Complexity - O(n)
        // Auxillary Space Complexity - O(1)

        // initialise variables
        int largest = arr[0];
        int secondLargest = -1;

        for (int i=1; i<arr.length;i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                continue;
            }

            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    };
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 35, 95};
        int[] test2 = {20, 10, 5, 8, 20};
        int[] test3 = {10, 10, 10, 10};

        System.out.println(findSecondLargest(test1));
        System.out.println(findSecondLargest(test2));
        System.out.println(findSecondLargest(test3));
    };
}
