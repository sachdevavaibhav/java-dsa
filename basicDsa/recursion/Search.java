package basicDsa.recursion;

public class Search {
    public static int search(int[] arr, int l, int r, int x) {
        // Time Complexity - Theta(n)
        // Aux Space Complexity - Theta(n)
        if (l>r) return -1;
        if (arr[l] == x) return l;

        return search(arr, l+1, r, x);
    }

    public static void main(String[] args) {
        int[] testArr = {1,3,4,5,787,34};
        System.out.println(search(testArr, 0, testArr.length-1, 5));
    }
}
