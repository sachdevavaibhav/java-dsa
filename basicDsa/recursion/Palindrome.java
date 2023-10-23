package basicDsa.recursion;

public class Palindrome {
    public static boolean checkPalindrome(String str, int low, int high) {
        // Time Complexity - O(n)
        // Aux Space Complexity - O(n)
        if (low > high) return true;

        if (str.charAt(low) != str.charAt(high)) return false;

        return checkPalindrome(str, low+1, high-1);
    };

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abbcbba", 0, 6));
        System.out.println(checkPalindrome("geeks", 0, 4));
    };
}
