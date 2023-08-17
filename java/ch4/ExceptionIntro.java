package ch4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionIntro {
    public static void main(String[] args) {
        fileHandle();
    }

    public static void fileHandle() {
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
}
