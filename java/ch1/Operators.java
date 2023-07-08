public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int x = 30; int y=40;
        System.out.println(x*y);
        System.out.println(x+y);
        System.out.println(x/y);
        System.out.println(x-y); 
        System.out.println(x%y); //modulo
        // Unary Operators - Unary operators need only one operand. They are used to increment, decrement, or negate a value.
        int a = 10;
        int b = a++; // b = a then a = a+1
        int c = -10;
        System.out.println(b);
        System.out.println(a);
        int d = ++a; // a = a+1 then d=a
        System.out.println(d); 
        System.out.println(-a);
        System.out.println(+c);
        // Assignment Operator - '=' Assignment operator is used to assign a value to any variable. It has a right to left associativity
        int z = 10; // z is assigned a value of 10
        // In many cases assignment operator can be combined with other operators to build a shorter version of statement called Compound Statement
        z+=5; // z=z+5, -=, *=, %=, /=
        System.out.println(z); 
        // Relational Operators
        // These operators are used to check for relations such as equality, greater than, less than. They return boolean result after the comparison
        int p = 23;
        int q = 32;
        System.out.println(p==q); // equal to
        System.out.println(p>=q); // >, < , <=
        System.out.println(p!=q); // Not equal to
        // Logical Operators
        // && - logical AND, || - logial OR
        boolean f = false; boolean t = true;
        System.out.println(t&&f);
        // Ternary Operator: condition ? if true : if false
        /*
        SHORT CIRCUITING:
         * In Java logical operators, if the evaluation of a logical expression exits in between before 
         * complete evaluation, then it is known as Short-circuit. A short circuit happens because the 
         * result is clear even before the complete evaluation of the expression, and the result is returned.
         */
    }
}
