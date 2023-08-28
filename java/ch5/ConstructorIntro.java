package ch5;

public class ConstructorIntro {
    int x, y;
    /*
     * Constructor is a special method that is used to initialize objects.
     * Constructor name must be same as class name.
     * Constructor must not have any return type.
     * If no constructor is defined, compiler will add a default constructor
     * which will initialize all instance variables to their default values.
     * If a constructor is defined, compiler will not add a default constructor.
     *
     */
    ConstructorIntro(int x, int y) { // constructor
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("x: " + x + "\ny: " + y);
    }
}

class TestConstructorIntro {
    public static void main(String[] args) {
        ConstructorIntro obj = new ConstructorIntro(10, 20);
        obj.display();
    }
}
