import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        ch = (char)(ch >= 'a' && ch <= 'z' ? ch - 'a' + 'A': ch - 'A' + 'a');
        System.out.println(ch);
        s.close();
    }
}
