package ch5;

public class Complex {
    /*
     * What is object oriented programming?
     * - Object oriented programming is a programming paradigm that uses objects and their interactions
     *  to design applications and computer programs.
     *
     * What is an object?
     * - An object is a software bundle of related state and behavior.
     *
     * What is a class?
     * - A class is a blueprint or prototype from which objects are created.
     *
     * What are members of class?
     * - Members of a class are the variables and methods defined in the class.
     *
     * What is constructor?
     * - A constructor is a special method that is used to initialize a newly created object and is
     * called just after the memory is allocated for the object. In case of java the name of constructor
     * should be same as class name.
     */
    int real, imag; // members of class
    Complex(int realNum, int imagNum) {
        real = realNum;
        imag = imagNum;
    }

    void print() {
        System.out.println(real + " + i" + imag);
    }

    void add(Complex c) {
        real += c.real;
        imag += c.imag;
    }
}

class Test {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        c1.print();
        Complex c2 = new Complex(12, 20);
        c2.add(c1);
        c2.print();
    }
}