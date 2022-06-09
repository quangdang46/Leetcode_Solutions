public class MyHashSet {
    private int SIZE = 10000;
    private ArrayList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[10001];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int hash = hashFunction(key);
        int idx = buckets[hash].indexOf(key);
        if (idx < 0) {
            buckets[hash].add(key);
        }
    }

    public void remove(int key) {
        int hash = hashFunction(key);
        int idx = buckets[hash].indexOf(key);
        if (idx >= 0) {
            buckets[hash].remove(idx);
        }
    }

    public boolean contains(int key) {
        int hash = hashFunction(key);
        return buckets[hash].indexOf(key) >= 0;
    }

}

class MyHashSet {
    private boolean[] set = new boolean[1000001];
    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }

}
