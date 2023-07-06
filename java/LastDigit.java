import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        x = Math.abs(x);
        int ans = x%10;
        System.out.println(ans);
        String str = s.nextLine();
        System.out.println(str);
        s.close();
    }
}
