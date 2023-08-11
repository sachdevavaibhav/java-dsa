package ch4;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        String path = "./java/ch4/create.txt";
        create(path);
        fileMethods(path);
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
}
