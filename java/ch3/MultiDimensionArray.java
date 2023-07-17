package ch3;

public class MultiDimensionArray {
    public static void main(String[] args) {
        // method 1: to create 2-d arrays
        // int[][] arr = {
        //     {1,2,3,4,8,9},
        //     {5,6,7,8}
        // };
        // method 2:
        int m = 3,n =2;
        int[][] arr2 = new int[m][n];
        // method 3: (jagged arrays)
        // int [][] arr3 = new int[m][]; // we dont need to specify the number of columns of each row in advance. this is jagged array
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = new int[2];
            for (int j=0; j<arr2[i].length; j++) {
                arr2[i][j] = i;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}