package ch3;

public class StringOps {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "GeeKS";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(1, 4));
    }
}
