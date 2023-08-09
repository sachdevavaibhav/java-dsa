package ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntro {
    /*
     * Stream is a sequence of elements that can be processed in a functional and declarative style. 
     * It provides a way to perform operations on collections of data, such as arrays or lists, using a 
     * more concise and expressive syntax.
     * 
     * Stream operations are either intermediate or terminal. Intermediate operations return a stream.
     * Terminal operations return a result or void.
     * 
     * Intermediate operations are lazy. They are not executed until a terminal operation is invoked.
     * Short Circuiting is a technique that allows the stream to stop processing elements when a condition is met. 
     * For example, the findFirst method returns the first element of a stream and then stops processing.
     * 
     * Stream operations can be performed in a pipeline. A pipeline is a sequence of stream operations.
     *
     * Intermediate operations:
     * map: transforms each element into another element
     * filter: removes elements that don't match a predicate
     * distinct: removes duplicate elements
     * sorted: sorts elements
     * limit: limits the number of elements
     * skip: skips elements
     * 
     * Terminal operations:
     * forEach: performs an action for each element
     * count: returns the number of elements
     * collect: returns a collection
     * reduce: combines elements into a single value
     * 
     * Stream operations can be performed in parallel. Parallel streams are created with the parallel method.
     * 
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 5, 2, 7, 1);
        Stream<Integer> mappedNums = nums.stream()
        .map(n->{
            System.out.println("Mapping "+n);
            return n*3;
        })
        .filter(n->{
            System.out.println("Filtering "+n);
            return n%2==1;
        });

        System.out.println("Before for each");
        mappedNums.forEach(n->System.out.println(n));
        System.out.println("After for each");
    }
}
