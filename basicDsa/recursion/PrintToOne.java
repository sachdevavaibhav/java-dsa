package basicDsa.recursion;

public class PrintToOne {
    public static void printToOne(int n) {
        // Recurrence Relation - T(n) = T(n-1) + c
        // Time Complexity - Theta(n)
        // Auxillary Space Complexity - Theta(n)
        if (n<=0) return;

        System.out.println(n);
        printToOne(n-1);
    };

    public static void main(String[] args) {
        printToOne(5);
    };
}
