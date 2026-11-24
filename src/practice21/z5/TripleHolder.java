package practice21.z5;

public class TripleHolder<T, V, K> {
    private T t;
    private V v;
    private K k;

    public TripleHolder(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() { return t; }
    public V getV() { return v; }
    public K getK() { return k; }

    @Override
    public String toString() {
        return "TripleHolder{t=" + t + ", v=" + v + ", k=" + k + "}";
    }

    public static void main(String[] args) {
        TripleHolder<String, Integer, Double> holder =
                new TripleHolder<>("text", 42, 3.14);
        System.out.println(holder);
    }
}
