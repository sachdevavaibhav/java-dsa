package ch4;

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        int[] arr = {30, 20, 10};
        System.out.println(sumExample(arr));
    }

    public static int sumExample(int[] nums) {
        int sum = Arrays.stream(nums)
                        .sum();
        return sum;
    }
}
