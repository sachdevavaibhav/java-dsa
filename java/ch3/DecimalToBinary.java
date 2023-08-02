package ch3;


public class DecimalToBinary {
    public static void main(String[] args) {
        String binary = "";
        int n = 10;
        while (n>0) {
            binary = (n%2) + binary;
            n = n/2;
        }
        System.out.println(binary);
    }
}
