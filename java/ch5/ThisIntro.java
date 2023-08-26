package ch5;

public class ThisIntro {
    /*
     * What is this?
     * - this is a keyword in Java that refers to the current object.
     *
     * What is the use of this?
     * - this can be used to refer to any member of the current object from within an instance method or a
     * constructor.
     *
     * What is the use of this()?
     * - this() is used to invoke a constructor of the same class.
     *
     * What is this keyword?
     * - this keyword refers to the current object in a method or constructor. It can be used to access
     * class members (variables and methods) as well as constructors. This keyword can be used to refer
     * to any member of the current object from within an instance method or a constructor.
     * It can be used to invoke or initiate current class constructor. It can be passed as an argument in
     * the method call. It can be passed as argument in the constructor call. It can be used to return
     * the current class instance.
     *
     * What is this()?
     * - this() is used to invoke a constructor of the same class. It can be used to invoke current class
     * constructor only. It is used to reuse the constructor. In other words, it is used for constructor
*/
    private int x, y;
    ThisIntro(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ThisIntro setX(int x) {
        this.x = x;
        return this;
    }

    public ThisIntro setY(int y) {
        this.y = y;
        return this;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static void main(String[] args) {
        ThisIntro t = new ThisIntro(10, 15);
        t.setX(20).setY(30); // method chaining using this
        System.out.println(t.x + " " + t.y); // accessible beacause in the same class
        ThisIntro x = t.setX(23);
        System.out.println(x);
    }

}

class TestThisIntro {
    public static void main(String[] args) {
        ThisIntro t = new ThisIntro(10, 15);
        t.setX(20).setY(30); // method chaining using this
        // System.out.println(t.x + " " + t.y); error: x and y are private and cannot be accessed outside its own class.
        System.out.println(t.getX() + " " + t.getY());
        ThisIntro x = t.setX(23);
        System.out.println(x);
    }
}
