public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Primitive data types
        // boolean, byte, short, int, long, float, double, char
        // Java is a statically typed language, meaning that all variables must be declared before they can be used.
        boolean isBoolean = true; // takes up 1 bit of memory (true or false)
        byte byteNum = 127; // takes up 8 bits (1 byte) of memory (signed integer from -128 to 127, total of 256 values)
        short shortNum = 32767; // takes up 16 bits (2 bytes) of memory (signed integer from -32768 to 32767, total of 65536 values)
        int intNum = 2147483647; // takes up 32 bits (4 bytes) of memory (signed integer from -2147483648 to 2147483647, total of 4294967296 values)
        long longNum = 9223372036854775807L; // takes up 64 bits (8 bytes) of memory (signed integer from -9223372036854775808 to 9223372036854775807, total of 18446744073709551616 values)
        float floatNum = 3.4028235E38F; //single precision,takes up 32 bits (4 bytes) of memory (signed floating point from 1.40129846432481707e-45 to 3.40282346638528860e+38, total of 3.4028235E38 values)
        double doubleNum = 1.7976931348623157E308; //double precision, takes up 64 bits (8 bytes) of memory (signed floating point from 4.94065645841246544e-324d to 1.79769313486231570e+308d, total of 1.7976931348623157E308 values)
        char charNum = 'A'; // takes up 16 bits (2 bytes) of memory (unsigned integer from 0 to 65535, total of 65536 values) (can also be used to store unicode characters)
        System.out.println("boolean:"+isBoolean);
        System.out.println("byte:"+byteNum);
        System.out.println("short:"+shortNum);
        System.out.println("int:"+intNum);
        System.out.println("long:"+longNum);
        System.out.println("float:"+floatNum);
        System.out.println("double:"+doubleNum);
        System.out.println("char:"+charNum);
    }
}