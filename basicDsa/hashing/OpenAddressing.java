package basicDsa.hashing;

public class OpenAddressing {
    int[] hashTable;
    int size;
    int capacity;
    OpenAddressing(int x) {
        hashTable = new int[x];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = -1;
        }
        this.size = 0;
        this.capacity = x;
    }
    int hashFunction(int x) {
        return x % capacity;
    }

    public boolean search(int key) {
        int hash = hashFunction(key);
        int i = hash;

        while (hashTable[i] !=-1) {
            if (hashTable[i] == key) {
                return true;
            };
            i = (i + 1) % capacity;
            if (i == hash) {
                return false;
            }
        }
        return false;
    }

    public boolean insert(int key) {
        if (size == capacity) {
            return false;
        }
        int hash = hashFunction(key);
        while (hashTable[hash] != -1 && hashTable[hash] != -2 && hashTable[hash] != key) {
            hash = (hash + 1) % capacity;
        }
        if (hashTable[hash] == key) {
            return false;
        }
        hashTable[hash] = key;
        size++;
        return true;
    }

    public boolean erase(int key) {
        int hash = hashFunction(key);
        int i = hash;
        while (hashTable[i] != -1) {
            if (hashTable[i] == key) {
                hashTable[i] = -2;
                size--;
                return true;
            }
            i = (i + 1) % capacity;
            if (i == hash) {
                return false;
            }
        }
        return false;
    }


}
