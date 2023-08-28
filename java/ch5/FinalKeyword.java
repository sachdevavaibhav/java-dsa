package ch5;

public class FinalKeyword {
    /*
     * for variable - value cannot be changed
     * for method - cannot be overridden
     * for class - cannot be extended
     */
    final int x = 25; // final variable
    public static void main(String[] args) {
        final int x;
        x = 10; // ok - can assign a value to final variable x once
        // x= 20; // error - cannot assign a value to final variable x once assigned
        System.out.println(x);
        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.x);
        // obj.x = 30; // error - cannot assign a value to final variable x once assigned
    }
}