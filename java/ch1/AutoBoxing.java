public class AutoBoxing {
    public static void main(String[] args) {
        int x1 = 20;
        Integer x2 = x1; //Auto Boxing (int witll be converted to object wrapper Integer), Integer is wrapper class
        int x3 = x2; // Auto UnBoxing (Object wrapper will be converted to primitive type int), int is primitive data type
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
