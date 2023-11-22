package basicDsa.hashing;

public class ZeroAndOne {
    public static int countZeroAndOne(int[] arr) {
        arr = replaceZero(arr);
        return LongestSubarray.longestSub(arr,0);
    }

    public static int[] replaceZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = -1;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 0};
        System.out.println(countZeroAndOne(arr));
    }
}
