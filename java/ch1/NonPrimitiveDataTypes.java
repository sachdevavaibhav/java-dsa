public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // Non-primitive data types
        /*
         Data types which are not primitive are called non-primitive data types. They are nothing but classes in Java and
         are built using primitive data types. Non-primitive data types are also called reference types because they refer
         to objects.  
         Differences between primitive and non-primitive data types:
            1. Primitive data types are predefined (already defined) in Java. Non-primitive data types are created by the programmer
            and is not defined by Java (except for String, System etc).
            2. Primitive data types are passed by value. Non-primitive data types are passed by reference.
            3. Primitive data types start with lowercase letters. Non-primitive data types start with uppercase letters.
            4. Primitive data types are stored on the stack. Non-primitive data types are stored on the heap.
        What is heap and stack memory?
            1. Stack memory: Stack memory is used only by one thread of execution. Whenever a method is invoked, a new block is created
            in the stack memory for the method to hold local primitive values and reference to other objects in the method. As soon as
            the method ends, the block becomes unused and becomes available for next method. Stack memory size is very less compared to
            Heap memory.
            2. Heap memory: Heap memory is used by all the parts of the application. Objects and their corresponding instance variables
            are created in the heap memory. Heap memory is divided into two parts: Young Generation and Old Generation. Young Generation
            is the place where all the new objects are created. When the young generation is filled, garbage collection is performed and
            objects that are no longer used are cleared. Old Generation is the place where all the long surviving objects are stored.
            Normally garbage collection is performed in Old Generation.    
        */
    }
}