package basicDsa.recursion;

public class SumNatural {
    public static int sumNatural(int n, int sum, int i) {
        // Time Complexity - Theta(n)
        // Aux Space Complexity - Theta(n)
        if (n==i) return sum+i;
        return sumNatural(n, sum+i, i+1);
    }
    public static int sumNatural2(int n) {
        // Time Complexity - Theta(n)
        // Aux Space Complexity - Theta(n)
        if (n==0) return 0;
        return n+sumNatural2(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumNatural(5, 0, 1));
        System.out.println(sumNatural2(5));
    }
}
