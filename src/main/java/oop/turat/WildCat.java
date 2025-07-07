package oop.turat;

public class WildCat extends Cat{
    boolean isDangerous;
    boolean needRedBook;

    public WildCat(String name, int age, boolean isDangerous, boolean needRedBook) {
        super(name, age);
        this.isDangerous = isDangerous;
        this.needRedBook = needRedBook;
    }
}
