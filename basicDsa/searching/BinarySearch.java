package basicDsa.searching;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start<end) {
            int mid = (start+end)/2;
            int element = arr[mid];
            if (element == target) return mid;
            else if (element>target) end = mid-1;
            else if (element<target) start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        System.out.println(search(arr, 60));
    }
}
