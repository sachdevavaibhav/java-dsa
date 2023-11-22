package basicDsa.hashing;
import java.util.HashSet;

public class SubarrayZero {

    public static boolean isZeroSum(int[] arr) {
        // Time Complexity: O(n)
        // Aux Space Complexity: O(n)
        HashSet<Integer> h = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (h.contains(preSum)) return true;
            if (preSum==0) {
                return true;
            }
            h.add(preSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,3,-1,1};
        System.out.println(isZeroSum(arr1));
    }
}
