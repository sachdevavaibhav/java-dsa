package basicDsa.recursion;

public class TowerOfHanoi {
    // Time Complexity - O(2^n)
    // Aux Space Complexity - O(n)
    public static void towerOfHanoi(int n, char src, char aux, char dest) {
        if (n==1) {
            System.out.println("Moving " + n + " from "+src+" -> "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, aux);
        System.out.println("Moving " + n + " from "+src+" -> "+dest);
        towerOfHanoi(n-1, aux, src, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(4, 'A', 'B', 'C');
    }
}
