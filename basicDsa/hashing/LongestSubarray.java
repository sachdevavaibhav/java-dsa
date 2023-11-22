package basicDsa.hashing;
import java.util.HashMap;

class LongestSubarray {
    public static int longestSub(int[] arr, int sum) {
        HashMap<Integer,Integer> table = new HashMap<>();
        int preSum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == sum) {
                len = i+1;
            }
            if (table.containsKey(preSum-sum)) {
                int tempLen = i-table.get(preSum-sum);
                if (tempLen>len) len = tempLen;
            }
            if (table.containsKey(preSum) == false) {
                table.put(preSum, i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,0,1,8,2,3,6};
        int[] arr2 = {5,8,-4,-4,2,-22};
        int[] arr3 = {8,3,5};
        int[] arr4 = {8,3,1,5,-6,6,2,2};
        System.out.println(longestSub(arr,  5));
        System.out.println(longestSub(arr2,  0));
        System.out.println(longestSub(arr3,  8));
        System.out.println(longestSub(arr4,  4));
    }
}