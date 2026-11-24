package practice20.z123;

import java.io.Serializable;

public class TripleBox<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private final T t;
    private final V v;
    private final K k;

    public TripleBox(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() { return t; }
    public V getV() { return v; }
    public K getK() { return k; }

    public void printClassNames() {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("V: " + v.getClass().getName());
        System.out.println("K: " + k.getClass().getName());
    }

    @Override
    public String toString() {
        return "TripleBox{t=" + t + ", v=" + v + ", k=" + k + "}";
    }

    public static void main(String[] args) {
        TripleBox<String, Dog, Integer> box =
                new TripleBox<>("Hello", new Dog("Rex"), 42);
        System.out.println(box);
        box.printClassNames();
    }
}
