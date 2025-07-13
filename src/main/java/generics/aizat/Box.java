package generics.aizat;

public class Box <T>{
    private T value;

    public Box (T value){
        this.value = value;
    }

    public T get(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
