package ch3;

public class ExtraChar {
    public static void main(String[] args) {
        char extra = extraChar("hello", "hellos");
        System.out.println(extra);
    }
    public static char extraChar(String s1, String s2){
        for (int i=0;i<s2.length();i++) {
            boolean isExtra = true;
            char ch2 = s2.charAt(i);
            for (int j=0; j<s1.length(); j++) {
                char ch1 = s1.charAt(j);
                if (ch1==ch2) {
                    isExtra = false;
                    break;
                }
            }
            if (isExtra) return ch2;
        }
        return 'a';
    }    

}
