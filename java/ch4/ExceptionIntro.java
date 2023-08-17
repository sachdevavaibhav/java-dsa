package ch4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionIntro {
    public static void main(String[] args) {
        // fileHandle();
        sum(args);
    }

    public static void fileHandle() {
        // checked exceptions - which are checked at compiled time (part of Exception class)
        try {
            Scanner sc = new Scanner(new File("test.in"));
            sc.close();
        }
        catch (FileNotFoundException err) {
            System.out.println("File not found");
        }
        finally {
            System.out.println("In the final block");
        }
    }

    public static void sum(String args[]) {
        // unchecked exceptions (part of Errors (which depend of external factors) class and RuntimeExceptions(subclass of Exceptions) class)
        int a, b, sum;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            sum=a+b;
            System.out.println("Result: " + sum);
        }
        catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Insufficient numbers provided.");
        }
    }
}
