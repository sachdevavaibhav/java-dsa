package ch3;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] a = {1,2,3}; // array is also an object in java.
        System.out.println(a[1]); //Java has 0 indexed array
        // Several ways to initalise an array object.
        int[] b; // int b[]; (another way)
        b = new int[3]; //create an array of length 3.
        b[0] = 1;
        b[1] = 2;
        b[3] = 43;
        // second way:
        int[] c = new int[3];
        c[0] = 1;
        c[1] = 2;
        c[3] = 43;
        // c[4] = 10; // will throw error if executed since array is of length 3.
        // third way:
        String[] d = {"apple", "banana"};
        // fourth way:
        int[] e = new int[3];
        int x = 10;
        for (int i=0; i<a.length; i++) {
            a[i] = x;
            x += 15;
        }
    }
}
