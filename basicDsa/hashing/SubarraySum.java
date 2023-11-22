package basicDsa.hashing;
import java.util.HashSet;

public class SubarraySum {
    public static boolean subarraySum(int[] arr, int sum) {
        // Time Complexity: O(n)
        // Aux Space Complexity: O(n)
        HashSet<Integer> h = new HashSet<Integer>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == sum) return true;
            if (h.contains(preSum-sum)) return true;
            h.add(preSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        System.out.println(subarraySum(arr, 20));
    }
}
