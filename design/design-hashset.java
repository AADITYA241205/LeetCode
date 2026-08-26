class MyHashSet {

    private List<Integer>[] buckets;
    private int size = 1000;

    public MyHashSet() {
        buckets = new LinkedList[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void add(int key) {

        int i = hash(key);

        if (buckets[i] == null)
            buckets[i] = new LinkedList<>();

        if (!buckets[i].contains(key))
            buckets[i].add(key);
    }

    public void remove(int key) {

        int i = hash(key);

        if (buckets[i] != null)
            buckets[i].remove((Integer) key);
    }

    public boolean contains(int key) {

        int i = hash(key);

        return buckets[i] != null &&
               buckets[i].contains(key);
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */