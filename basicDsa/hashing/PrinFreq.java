package basicDsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class PrinFreq {
    public static void freq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
            else map.put(arr[i], 1);
        }

        for (Map.Entry<Integer,Integer> itr:map.entrySet()) {
            System.out.println(itr.getKey() + " "+ itr.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {50,50,10,40,10};
        freq(arr);
    }
}
