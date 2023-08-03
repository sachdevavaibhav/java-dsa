package ch3;


public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        String binary = toBinary(n);
        System.out.println(binary);
    }

    public static String toBinary(int n) {
        String binary = "";
        while (n>0) {
            binary = (n%2) + binary;
            n = n/2;
        }
        return binary;
    }
}
