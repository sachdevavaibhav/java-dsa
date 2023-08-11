package ch4;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        // System.out.println(sumExample(arr));
        // System.out.println(maxExample(arr));
        System.out.println(averageExample(arr));
        digitExample();
    }

    public static int sumExample(int[] nums) {
        int sum = Arrays.stream(nums)
                        .sum();
        return sum;
    }

    public static int maxExample(int[] nums) {
        int max = Arrays.stream(nums)
                        .max()
                        .getAsInt();
        return max;
    }

    public static double averageExample(int[] nums) {
        double average = Arrays.stream(nums)
                        .average()
                        .getAsDouble();
        return average;
    }

    public static void digitExample() {
         Stream.iterate(1, i -> i + 1)
            .filter(i -> i.toString().contains("5"))
            .limit(10)
            .forEach(System.out::println);
    }
}
