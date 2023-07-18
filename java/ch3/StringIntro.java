package ch3;

public class StringIntro {
    public static void main(String[] args) {
        // String are sequence of character. Java uses utf-16 to store string characters.
        /*
         Strings in java can be created using four ways:
         1. Array of characters.
         2. String class (Immutable => Thread safe)
         3. StringBuffer class (Mutable and thread safe)
         4. StringBuilder class (Mutable and thread unsafe)
         */
        makeString();
    }

    public static void makeString() {
        // 1. 
        char[] strArr = {'v', 's'};
        System.out.println(strArr);
        // 2.
        String str = "vaibhav";
        // or
        String str2 = new String("sachdeva");
        System.out.println(str+" "+str2);
        // 3.
        StringBuffer strBuff = new StringBuffer("vaibhav buffer");
        System.out.println(strBuff);
        // 4. 
        StringBuilder strBuild = new StringBuilder("vaibhav build");
        System.out.println(strBuild);
    }

    public static void stringClassMethod() {
        String str = "I am a string";
        System.out.println(str.length()); // returns length of str
        System.out.println(str.charAt(5)); // returns character at specified index
        System.out.println(str.substring(2)); // startIdx to end of string
        System.out.println(str.substring(2, 5)); // [startIdx, endIdx)
    }

    public static void stringMemory() {
        String str1 = "string";
        String str2 = "string";
        // When we create string objects using literals and the objects have same value java compiler will not make separate objects
        // but will refer both variables to same object.
        // This helps in memory optimization.
        if (str1 == str2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        // When we make string with new keyword it will always create new object even if they have same value.
        String str3 = new String("string");
        if (str1 == str3) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void moreMethods() {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        System.out.println(s1.contains(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.indexOf(s2, 1));
    }

    public static void exampleString() {
        String s1 = "vabs";
        String s2 = s1;
        s1 = s1 + "@01"; //or s1 = s1.concat(s2); (Remember string objects are immutable which means any operation on them will create new object rather than modigying the existing one)
        System.out.println(s1);
        System.out.println(s1 == s2);
    }
}
