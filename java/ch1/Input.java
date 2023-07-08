package ch1;
import java.io.*;

public class Input {
    public static void main(String[] args) throws IOException {
        // Two ways to read input:
        //      1. BufferedReader
        //      2. Scanner

        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String s = br.readLine();
        System.out.print("Enter int: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println(s); 
        System.out.println(x);

        // Scanner
    }
}