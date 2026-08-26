class MyHashMap {

    class Pair {
        int key, value;
        Pair(int k, int v) {
            key = k;
            value = v;
        }
    }

    private List<Pair>[] buckets;
    private int size = 1000;

    public MyHashMap() {
        buckets = new LinkedList[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {

        int i = hash(key);

        if (buckets[i] == null)
            buckets[i] = new LinkedList<>();

        for (Pair p : buckets[i]) {
            if (p.key == key) {
                p.value = value;
                return;
            }
        }

        buckets[i].add(new Pair(key, value));
    }

    public int get(int key) {

        int i = hash(key);

        if (buckets[i] != null) {
            for (Pair p : buckets[i]) {
                if (p.key == key)
                    return p.value;
            }
        }

        return -1;
    }

    public void remove(int key) {

        int i = hash(key);

        if (buckets[i] != null) {

            Iterator<Pair> it = buckets[i].iterator();

            while (it.hasNext()) {
                if (it.next().key == key) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */