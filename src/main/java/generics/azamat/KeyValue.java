package generics.azamat;

public class KeyValue<K, V> {
    private K id;
    private V sum;

    public KeyValue(K id, V sum) {
        this.id = id;
        this.sum = sum;
    }

    public K getId() {
        return id;
    }

    public void setSum(V sum) {
        this.sum = sum;
    }
}
