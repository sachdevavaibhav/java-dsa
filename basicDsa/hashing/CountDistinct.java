package basicDsa.hashing;

import java.util.HashSet;

public class CountDistinct {
    public static int count(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                count++;
                set.add(arr[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {15, 12, 13, 12, 13, 13, 18};
        int[] arr2 = {15, 15, 15};
        System.out.println(count(arr));
        System.out.println(count(arr2));
    }
}
