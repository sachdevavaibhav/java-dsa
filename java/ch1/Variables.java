public class Variables {
    // instance variables
    int y = 21;
    boolean a;
    // static variable
    static int z = 31;
    public static void main(String[] args) {
        // A variable is a name given to a memory location. It is the basic unit of storage in a program.
        // The value stored in a variable can be changed during program execution.
        // A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
        // In Java, all the variables must be declared before use.
        // Three types of variables in Java: local variables, instance variables, and class variables.
        int x = 10; // local variable - It must be initialised before use.
        System.out.println(x);
    }
}

class UseVariable {
    // using static and instance variables. The local variables can only be accessed inside their function/block of code.
    public static void main(String[] args) {
        Variables var = new Variables();
        Variables var2 = new Variables();
        System.out.println(Variables.z);
        Variables.z = 41;
        var.y = 51;
        System.out.println(Variables.z);
        System.out.println(var.a);
        System.out.println(var.y);
        System.out.println(var2.y);
    }
}
