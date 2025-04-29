import java.util.LinkedList;

public class MyHashSet <T> {
    private LinkedList<T>[] buckets;
    private int size;

    public MyHashSet() {
        size = 0;
        buckets = new LinkedList[16];
    }

    public boolean add(T element) {
        if (element == null || contains(element)) {
            return false;
        }

        int bucketIndex = getIndex(element);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();
        }

        size++;
        buckets[bucketIndex].add(element);
        return true;
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        int bucketIndex = getIndex(element);
        if (buckets[bucketIndex] == null) {
            return false;
        }

        for (T e : buckets[bucketIndex]) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(T element) {
        if (element == null) {
            return false;
        }

        int bucketIndex = getIndex(element);

        if (buckets[bucketIndex] == null) {
            return false;
        }

        for (T e : buckets[bucketIndex]) {
            if (e.equals(element)) {
                buckets[bucketIndex].remove(e);
                size--;
                return true;
            }
        }

        return false;
    }

    private int getIndex(T element) {
        return (element.hashCode() & 0x7FFFFFFF) % buckets.length;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (LinkedList<T> bucket : buckets) {
            if (bucket != null) {
                for (T element : bucket) {
                    if (!first) {
                        sb.append(", ");
                    }
                    sb.append(element);
                    first = false;
                }
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
