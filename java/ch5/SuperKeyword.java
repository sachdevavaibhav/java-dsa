package ch5;

public class SuperKeyword {
    int x;
    SuperKeyword() {
        this.x = 10; // this keyword is used to refer to the current object, we are overwriting the default constructor
    }
    SuperKeyword(int x) {
        this.x = x;
    }
    // if object is created without any arguments, then the default constructor is called otherwise the constructor with arguments is called.
}

class SubClass extends SuperKeyword {
    int y;
    SubClass() {
        // super keyword is used to refer to the parent class
        super(); // we do not need to write this line, it is automatically added by the compiler
    }
    SubClass(int x, int y) {
        super(x);
        this.y = y;
    }
}

class TestSuperKeyword {
    public static void main(String[] args) {
        // SuperKeyword obj = new SuperKeyword(2);
        // System.out.println(obj.x); // 10
        SubClass obj = new SubClass(2,3);
        System.out.println(obj.x); // 2
        System.out.println(obj.y); // 3
    }
}