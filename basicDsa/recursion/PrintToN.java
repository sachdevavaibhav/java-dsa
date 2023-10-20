package basicDsa.recursion;

public class PrintToN {
    public static void printToN(int n) {
        // Recurrence Relation - T(n) = T(n-1) + c
        // Time Complexity - Theta(n)
        // Auxillary Space Complexity - Theta(n)
        if (n<=0) return;

        printToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printToN(5);
    }
}
