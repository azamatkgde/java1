package generics.erlan;

public class Holder<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void printData() {
        System.out.println("Маалымат: " + data.toString());
    }
}
