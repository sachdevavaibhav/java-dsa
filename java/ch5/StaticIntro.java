package ch5;

public class StaticIntro {
    /*
     *  Static members can be accessed using class name
     * Static members can be accessed without creating an object
     * Static methods cannot access not-static members
     * Non-static methods can access static members
     * Static methods can only call other static methods
     * Static method do not have access to this and super keywords
     */
    String name;
    int id;
    static int playerCount = 0; // static variable - shared by all objects of the class and can be accessed without creating an object
    StaticIntro(String name) {
        this.name = name;
        this.id = ++playerCount;
    }
    void display() {
        System.out.println("Name: " + name + "\nID: " + id);
    }
}

class TestStaticIntro {
    public static void main(String[] args) {
        StaticIntro obj1 = new StaticIntro("John");
        StaticIntro obj2 = new StaticIntro("Jane");
        obj1.display();
        obj2.display();
        System.out.println("Total players: " + StaticIntro.playerCount);
    }
}
