package basicDsa.arrays;

import java.util.Arrays;

public class ZerosToEnd {
    public static int[] moveZeros(int[] arr) {
        int zero = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && zero == -1) {
                zero = i;
                continue;
            }

            if (arr[i] !=0 && zero != -1) {
                arr[zero] = arr[i];
                arr[i] = 0;
                zero++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 35, 95};
        int[] test2 = {8, 5, 0, 10, 0, 0, 0, 12, 3, 0};
        int[] test3 = {0, 0, 10, 0};
        int[] test4 = {0, 0, 0, 0};

        System.out.println(Arrays.toString(moveZeros(test1)));
        System.out.println(Arrays.toString(moveZeros(test2)));
        System.out.println(Arrays.toString(moveZeros(test3)));
        System.out.println(Arrays.toString(moveZeros(test4)));
    }
}
