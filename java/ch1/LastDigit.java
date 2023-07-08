package ch1;
import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        x = Math.abs(x);
        int ans = x%10;
        System.out.println(ans);
    }
}
