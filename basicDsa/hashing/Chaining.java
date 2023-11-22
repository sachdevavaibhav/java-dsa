package basicDsa.hashing;

// import LinkedList
import java.util.LinkedList;

public class Chaining {
    LinkedList<Integer>[] hashTable;
    Chaining(int x) {
        hashTable = new LinkedList[x];
    }

    int hashFunction(int x) {
        return x % hashTable.length;
    }

    void insert(int x) {
        int index = hashFunction(x);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
        }
        hashTable[index].add(x);
    }

    boolean search(int x) {
        int index = hashFunction(x);
        if (hashTable[index] != null) {
            return hashTable[index].contains(x);
        }
        return false;
    }

    void delete(int x) {
        int index = hashFunction(x);
        if (hashTable[index] != null) {
            hashTable[index].remove((Integer) x);
        }
    }

    void display() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.print(i + " --> ");
            if (hashTable[i] != null) {
                for (int j = 0; j < hashTable[i].size(); j++) {
                    System.out.print(hashTable[i].get(j) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Chaining obj = new Chaining(7);
        obj.insert(10);
        obj.insert(20);
        obj.insert(15);
        obj.insert(7);
        obj.insert(22);
        obj.insert(35);
        obj.insert(50);
        obj.display();
        System.out.println(obj.search(22));
        obj.delete(22);
        System.out.println(obj.search(22));
        obj.display();
    }
}