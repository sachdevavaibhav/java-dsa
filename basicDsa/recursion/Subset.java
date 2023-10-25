package basicDsa.recursion;

public class Subset {
    public static void printSubset(String str, String curr, int index) {
        // Time Complexity - O(2^n)
        // Aux Space Complexity - O(n)
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        printSubset(str, curr, index+1);
        printSubset(str, curr+str.charAt(index), index+1);
    }

    public static void main(String[] args) {
        printSubset("asdfasdgfsagsafgfgfagafg","", 0);
    }
}

/*
 * "AB"
 * "" index = 0
 * /  \
 * "A" "" index = 1
 * / \
 *"AB""A"
 *
 */