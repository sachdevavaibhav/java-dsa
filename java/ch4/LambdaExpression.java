package ch4;

import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        // without lambda expressions
        // class myPredicate implements Predicate<Integer> {
        //     public boolean test(Integer x) {
        //         return x%2==0;
        //     }
        // }
        // int[] arr = {1,2,3,4};
        // printCond(arr, new myPredicate());
        // with lambda expressions
        int[] arr = {1,2,3,4};
        printCond(arr, x -> x%2==0); //the function passed in the second argument will become the implementation of abstract method of Predicate functional interface.
        /*
         * Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface). 
         * Lamba expressions can be written in three ways:
         */
    }   
    
    public static void printCond(int[] arr, Predicate<Integer> p) {
        for (int x: arr) {
            Integer y = Integer.valueOf(x);
            if (p.test(y)) {
                System.out.print(y+" ");
            }
        }
    }
}
