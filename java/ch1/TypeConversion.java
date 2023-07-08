package ch1;
public class TypeConversion {
    public static void main(String[] args) {
        // widening or implicit type conversion
        int x1 = 20;
        long x2 = x1; // int to long
        float x3 = x2; // long to float
        double x4 = x3; // float to double
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        // narrowing or explicit type conversion
        double y1 = 20.0;
        float y2 = (float) y1; // double to float
        long y3 = (long) y2; // float to long
        int y4 = (int) y3; // long to int
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
        // long (64 bit) -> float (32 bit), might lose some precision but the exponent will be correct.
        long value = 1234567890123456789L;
        float convertedVal = value;
        System.out.println(convertedVal); // 1.234568E18
    }
}
