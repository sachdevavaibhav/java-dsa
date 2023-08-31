package ch5;

interface Printable {
    void print();
    default void printDefault() {
        System.out.println("Inside default method");
    }
    static void printStatic() {
        System.out.println("Inside static method");
    }
}

public class InterfaceIntro implements Printable {
    /*
    * 1. An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods.
    * 2. All methods and members are public.
    * 3. All methods are abstract by default.
    * 4. We can also have default and static methods.
    * 5. A class can implement more than one interface.
    * 6. A class can implement an interface and extend another class at the same time.
    * 7. A class that implements an interface must provide implementation to all the methods in the interface.
    * 8. We cannot create objects of interface.
    * 9. An interface can extend another interface. It can extend more than one interface.
    * 10. All variables in interface are public, static, and final.
    * 11. Interface is used to achieve abstraction and multiple inheritance.
    */
    @Override
    public void print() { // we have to provide implementation to the abstract method and it has to be public because all methods in interface are public
        System.out.println("Inside print method");
    }
}

class TestInterface {
    public static void main(String[] args) {
        InterfaceIntro obj = new InterfaceIntro();
        obj.print();
        obj.printDefault();
        Printable.printStatic();
    }
}
