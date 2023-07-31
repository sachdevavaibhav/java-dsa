package ch3;

public class MatchPattern {
    public static void main(String[] args) {
        String s = "xxyyxxxyy";
        int pattern = isFollPatt(s);
        System.out.println(pattern);
    }
    public static int isFollPatt(String s) {
        int xCount = 0 , yCount = 0;
        char prevChar = 'x';
        for (int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch!=prevChar) {
                if (prevChar == 'x') {
                    yCount=1;
                    prevChar = ch;
                    continue;
                }
                else if (prevChar=='y') {
                    if (xCount != yCount) return 0;
                    else {
                        xCount=1;
                        yCount=0;
                        prevChar = ch;
                        continue;
                    }
                }
            }
            else {
                if (ch == 'x') xCount+=1;
                else yCount+=1;
            }
            prevChar = ch;
        } 
        if (xCount!=yCount) return 0;
        return 1;
    }
}
