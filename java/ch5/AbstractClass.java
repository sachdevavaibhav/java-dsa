package ch5;

abstract class AbstractClass {
    /*
     * 1. An abstract class is a class that is declared with abstract keyword.
     * 2. An abstract class may or may not have abstract methods.
     * 3. If a class has at least one abstract method, then the class must be declared abstract.
     * 4. If a class is declared abstract, it cannot be instantiated.
     * 5. To use an abstract class, we have to inherit it from another class, provide implementations to the abstract methods in it.
     * 6. If we inherit an abstract class, we have to provide implementations to all the abstract methods in it.
     * 7. If we do not provide implementations to all the abstract methods, then the derived class must also be declared abstract.
     * 8. We cannot declare abstract constructors or abstract static methods.
     * 9. We cannot declare abstract methods as final or private.
     * 10. We cannot declare abstract methods as static because static methods cannot be overridden.
     * 11. Reference variable of abstract class can point to the objects of its sub-classes.
     * 12. Abstract class can have data members, constructors, and non-abstract methods.
     * 13. Abstract class can have final methods.
     * 14. Abstract class can have static methods.
     */
    int color;
    int getColor() {return color;}
    AbstractClass(int color) {
        this.color = color;
    }
    abstract double getArea(); // abstract method-does not have code implementation
}

class Square extends AbstractClass {
    double side;
    Square(int color, double side){
        super(color);
        this.side = side;
    }
    @Override
    double getArea() {return side * side;} // we have to provide implementation to the abstract method
}

class TestSquareClass {
    public static void main(String[] args) {
        Square obj = new Square(1, 5.0);
        System.out.println(obj.getArea());
    }
}
