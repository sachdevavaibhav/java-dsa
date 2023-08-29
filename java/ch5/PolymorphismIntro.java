package ch5;

public class PolymorphismIntro {
    /*
     * Polymorphism is the ability of an object to take on many forms.
     * Two types of polymorphism:
     *  - Compile-time polymorphism = method overloading
     *  - Run-time polymorphism = method overriding
     * # Method overloading - same method name, different parameters
     * # Method overriding - same method name, same parameters but different implementation (inherited method) - we can use the super keyword to call the parent class method
     */
    // Method overloading
    public int sum (int a, int b) {
        return a + b;
    }
    public int sum (int a, int b, int c) {
        return a + b + c;
    }
    public double sum (double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        PolymorphismIntro obj = new PolymorphismIntro();
        System.out.println(obj.sum(2,3)); // 5
        System.out.println(obj.sum(2,3,4)); // 9
        System.out.println(obj.sum(2.0,3.5)); // 6.0
    }

    /*
     * 1. Method overriding is typically achieved by:
     *  a) changing the number of arguments in the method
     *  b) changing the data type of the arguments
     *  c) a mix of both a) and b)
     * 2. We cannot do method overriding by only changing the return type of the method.
     * 3. If a method with exact data type is not found, then automatic type conversion happens.
     */
}
