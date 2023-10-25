package basicDsa.recursion;

public class SumOfDigits {
    public static int sumDigits(int digit) {
        // Time Complexity - Theta(n)
        // Aux Space Complexity - Theta(n)

        // We can also use tail recursion by maitaing a variable sum and returning it when the base case hits.
        if (digit == 0) return 0;

        int lastDigit = digit%10;
        int remainingDigit = digit/10;
        return lastDigit + sumDigits(remainingDigit);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(23523524));
        System.out.println(sumDigits(0));
    }
}
