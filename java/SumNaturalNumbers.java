import java.util.Scanner;

public class SumNaturalNumbers {
    public static int naive(int n) {
        // time: O(n), space: O(1)
        int result = 0;
        for (int i=1; i<=n; i++) {
            result += i;
        }
        return result;
    }

    public static int efficient(int n) {
        // time: O(1), space: O(1)
        int result = (n*(n+1))/2;
        return result;
    }
    public static void main(String[] args) {
        // sum of n terms in AP: n/2*[2*a + (n-1)*d]
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int naiveResult = naive(n);
        System.out.println(naiveResult);    
        int efficientResult = efficient(n);    
        System.out.println(efficientResult);
    }
}
