package ch5;

public class Inheritance {
    int id;
    int salary;
    /*
     * Inheritance is a mechanism in which one object acquires all the properties and
     * behaviors of a parent class.
     * Benefits of inheritance:
     *  - Code reusability
     *  - Method overriding
     *  - implements is a relationship
     *  - used in abstract classes and interfaces
     */
    Inheritance(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
}

class Manager extends Inheritance {
    int bonus;
    Manager(int id, int salary, int bonus) {
        super(id, salary); // super calls the constructor of the parent class
        this.bonus = bonus;
    }
    void display() {
        System.out.println("ID: " + id + "\nSalary: " + salary + "\nBonus: " + bonus);
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Manager obj = new Manager(1, 10000, 5000);
        obj.display();
    }
}