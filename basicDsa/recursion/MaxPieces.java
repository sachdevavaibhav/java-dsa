package basicDsa.recursion;

public class MaxPieces {
    public static int maxPieces(int n, int a, int b, int c, int pieces) {
        /*
         * Problem - Given a rope of length n, you need to  find the maximum number of pieces
         * you can make such that the length of every piece is in set {a,b,c} for given three values
         * a,b,c.
         */
        if (n==0) return pieces;

        if (n<a && n<b && n<c) return -1;

        int temp1 = -1;
        int temp2 = -1;
        int temp3 = -1;

        if (n>=a) temp1 = maxPieces(n%a, a, b, c, pieces+n/a);
        if (n>=b) temp2 = maxPieces(n%b, a, b, c, pieces+n/b);
        if (n>=c) temp3 = maxPieces(n%c, a, b, c, pieces+n/c);

        return Math.max(temp1, Math.max(temp2, temp3));
    }
    public static void main(String[] args) {
        System.out.println(maxPieces(5, 4, 2, 6, 0));
        System.out.println(maxPieces(9, 2, 2, 2, 0));
        System.out.println(maxPieces(17, 10, 11, 3, 0));
        System.out.println(maxPieces(10, 9, 7, 11, 0));
        System.out.println(maxPieces(5, 2, 1, 5, 0));
    }
}
