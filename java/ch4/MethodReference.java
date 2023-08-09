package ch4;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    /*
     * Java provides a new feature called method reference in Java 8. Method reference is used to refer method of 
     * functional interface. It is compact and easy form of lambda expression. 
     * Each time when you are using lambda expression to just referring a method, you can replace your 
     * lambda expression with method reference.
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 5, 2, 7, 1);
        nums.forEach(x -> System.out.println(x)); // lambda expression
        nums.forEach(System.out::println); // method reference
        // The above two lines are equivalent.
        // The :: operator is used to refer method of functional interface.
        // Method reference is used when we simply pass the parameters of the method to another method.
        nums.forEach(MethodReference::printSquare);
    }
    public static void printSquare(Integer x) {
        System.out.println(x * x);
    }
}
