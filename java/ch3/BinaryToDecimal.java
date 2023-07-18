package ch3;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str = "1010";
        int dec = 0;
        int k = 1;
        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(str.length()-i-1);
            dec+= Character.getNumericValue(ch)*k;
            k*=2;
        }
        System.out.println(dec);
    }
}
