package ch4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingIntro {
    /* 
    stream - a sequence of data in a file
    types of streams:
        - character streaming = 2 bytes at a time (used for text files)
                                - FileReader, FileWriter 
        - byte streaming = 1 byte at a time (used for images, audio, video, etc.)
                            - FileInputStream, FileOutputStream
    */ 
    public static void main(String[] args) throws IOException {
        // byteStreamCopy("./java/ch4/input.txt", "./java/ch4/output.txt");
        characterStreamCopy("./java/ch4/input.txt", "./java/ch4/output.txt");
    }

    public static void byteStreamCopy(String source, String destination) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream(source);
            out = new FileOutputStream(destination);
            int c;
            while ((c=in.read())!=-1) {
                out.write(c);
            }
        }
        finally{
            if (in!=null) {
                in.close();
            }
            if (out!=null) {
                out.close();
            }
        }
    }
    public static void characterStreamCopy(String source, String destination) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader(source);
            out = new FileWriter(destination);
            int c;
        while ((c=in.read())!=-1) {
            out.write(c);
        }
        // c = in.read();
        // out.write(c);
        }
        finally{
            if (in!=null) {
                in.close();
            }
            if (out!=null) {
                out.close();
            }
        }
    }
}
