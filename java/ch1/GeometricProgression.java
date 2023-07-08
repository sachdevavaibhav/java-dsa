package ch1;
import java.util.Scanner;

public class GeometricProgression {
    public static int nthTerm(int a, int r, int n) {
        return a*(int)(Math.pow(r, n-1));
    }

    public static void main(String[] args) {
        // ans = a*(r^(n-1))
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int r = s.nextInt();
        int n = s.nextInt();
        System.out.println(nthTerm(a, r, n));
    }
    
}
