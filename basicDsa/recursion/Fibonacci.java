package basicDsa.recursion;

public class Fibonacci {
    // Time Complexity - O(2^n)
    // Aux Space Complexity - O(n)
    public static int fibonacci(int n) {
        if (n<=1) return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}