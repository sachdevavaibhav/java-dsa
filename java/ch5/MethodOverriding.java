package ch5;

public class MethodOverriding {
    void func() {
        System.out.println("Inside parent class");
    }
}

class Child extends MethodOverriding {
    @Override
    void func() {
        System.out.println("Inside child class");
    }
}

class TestMethodOverriding {
    public static void main(String[] args) {
        // MethodOverriding obj = new MethodOverriding();
        // obj.func(); // Inside parent class
        // Child obj2 = new Child();
        // obj2.func(); // Inside child class
        MethodOverriding obj3 = new Child(); // Child class object is assigned to parent class reference variable - this is called dynamic method dispatch
        // this helps us to achieve run-time polymorphism - the method call is determined at run-time
        obj3.func(); // Inside child class
    }
}
/*
 * 1. If we have a static method in parent class and we try to override it in the child class, then it will not be overridden.
 *    Instead, the child class will have a new static method with the same name. This is because the static method is bound with class
 *    whereas instance method is bound with an object.
 * 2. We can call parent class method in child class using super keyword.
 */