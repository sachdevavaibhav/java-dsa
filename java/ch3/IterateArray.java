package ch3;

public class IterateArray {
    public static void main(String[] args) {
        int[] marks = {10, 2, 5, 20};
        int sum = 0, sumSq = 0;
        double mean, stdDev;
        // Normal for loop
        // for (int i=0; i<marks.length;i++) {
        //     sum += marks[i];
        //     sumSq += marks[i]*marks[i];
        // }
        // Enhanced for loop
        for (int item: marks) {
            // for each item in int[] marks
            sum+=item;
            sumSq+=item*item;
        }
        mean = (double)sum/marks.length;
        stdDev = Math.sqrt((double)sumSq/marks.length-mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard Deviation is: %.2f%n", stdDev);
    }
}
