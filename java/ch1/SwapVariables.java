package ch1;
public class SwapVariables {
    public static void main(String[] args) {
        // Create a temporary variable to store the inital value of the variable to be swapped first.
        int a = 10;
        int b = 20;
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}