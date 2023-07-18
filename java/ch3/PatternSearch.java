package ch3;

public class PatternSearch {
    public static void main(String[] args) {
        System.out.println(searchFloat("123.45657"));
    }

    public static void searchIdx(String txt, String pattern) {
        int idx = txt.indexOf(pattern);
        while (idx>=0) {
            System.out.print(idx+" ");
            idx = txt.indexOf(pattern, idx+1);
        }
        System.out.println();
    }

    public static String searchFloat(String txt) {
        int idx = txt.indexOf(".");
        if (idx>=0) {
            return txt.substring(idx+1);
        }
        return "";
    }   
}
