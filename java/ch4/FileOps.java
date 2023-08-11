package ch4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOps {
    public static void main(String[] args) {
        String path = "./java/ch4/create.txt";
        String writePath = "./java/ch4/output.txt";
        create(path);
        fileMethods(path);
        write(writePath);
        read(writePath);
    }

    public static void create(String filePathName) {
        try {
            File obj = new File(filePathName);
            if (obj.createNewFile()) {
                System.out.println(obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }

    public static void fileMethods(String source) {
        File obj = new File(source);
        if (obj.exists()) {
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.canWrite());
            System.out.println(obj.canRead());
            System.out.println(obj.length());
        }
        else {
            System.out.println("File does not exists.");
        }
    }

    public static void write(String filePath) {
        try {
            FileWriter wr = new FileWriter(filePath);
            wr.write("Hello world to file handling in java.");
            wr.close();
            System.out.println("Written Successfully");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void read(String filePath) {
        try {
            File obj = new File(filePath);
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
