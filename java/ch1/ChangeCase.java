import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        ch = (char)(ch >= 'a' && ch <= 'z' ? ch - 'a' + 'A': ch - 'A' + 'a'); // when compare two char in java it boils down to comparison of two int which are associated ASCII values.
        System.out.println(ch);
        s.close();
    }
}
