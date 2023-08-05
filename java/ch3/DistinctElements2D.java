package ch3;

import java.util.HashMap;
import java.util.Map;

public class DistinctElements2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {2,1,4,3},
            {1,2,3,2},
            {3,6,2,3},
            {5,2,5,3}
        };
        System.out.println(distict(matrix, 4));
    }
    public static int distict(int M[][], int N) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            // Increasing frequency of elements if they 
            // occur in the ith row. 
            for(int j = 0; j < N; j++){
                if(hm.getOrDefault(M[i][j], 0) == i)
                    hm.put(M[i][j], hm.getOrDefault(M[i][j], 0) + 1);
            }
        }
        
        int count = 0;
        // If elements have occured in all the rows, then 
        // it's corresponding value should be N
        for(Map.Entry<Integer, Integer> e : hm.entrySet())
            if(e.getValue() == N)
                count++;
        return count;
    }
}
