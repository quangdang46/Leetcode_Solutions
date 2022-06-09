class MyHashMap {
    private final int SIZE = 10000;

    private class Data {
        int key, value;

        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Data) {
                return ((Data) obj).key == this.key;
            }
            return false;
        }
    }

    private ArrayList<Data>[] data;

    public MyHashMap() {
        data = new ArrayList[SIZE + 1];
        for (int i = 0; i < data.length; i++) {
            data[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int hash = hashFunction(key);
        Data d = new Data(key, value);
        int idx = data[hash].indexOf(d);
        if (idx >= 0) {
            data[hash].get(idx).value = value;
        } else {
            data[hash].add(d);
        }
    }

    public void remove(int key) {
        int hash = hashFunction(key);
        Data d = new Data(key, 0);
        int idx = data[hash].indexOf(d);
        data[hash].remove(d);

    }

    public int get(int key) {
        int hash = hashFunction(key);
        Data d = new Data(key, 0);
        int idx = data[hash].indexOf(d);
        if (idx >= 0) {
            return data[hash].get(idx).value;
        }
        return -1;
    }
}

class MyHashMap {

    public MyHashMap() {
        lists = new List[kSize];

        for (int i = 0; i < kSize; ++i)
            lists[i] = new ArrayList<>();
    }


    public void put(int key, int value) {
        for (int[] pair : lists[key % kSize])
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        lists[key % kSize].add(new int[] { key, value });
    }

    public int get(int key) {
        for (int[] pair : lists[key % kSize])
            if (pair[0] == key)
                return pair[1];
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < lists[key % kSize].size(); ++i)
            if (lists[key % kSize].get(i)[0] == key) {
                lists[key % kSize].remove(i);
                return;
            }
    }

    private static final int kSize = 10000;
    List<int[]>[] lists;
}
