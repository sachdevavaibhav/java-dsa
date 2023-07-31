package ch3;

public class DistinctCount {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        int count = distinct(arr, 4);
        System.out.println(count);
    }

    static int distinct(int arr[], int n) {
        int count = 1;
        for (int i=1;i<n;i++) {
            boolean isDistinct = true;
            for (int j=0; j<i;j++) {
                if (arr[j] == arr[i]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) count++;
        }
        return count;
    }
}
