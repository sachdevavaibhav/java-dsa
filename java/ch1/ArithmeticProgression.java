import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        // nth = a+(n-1)*d
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        System.out.println(a+(n-1)*d);
    }
}
