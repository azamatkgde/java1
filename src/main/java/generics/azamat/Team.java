package generics.azamat;

public abstract class Team<T> implements Club<T> {
    private T id;

    public T getId() {
        return id;
    }
}
