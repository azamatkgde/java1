package basics.azhibai;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private double price;

    public Dog(String name, int age, String breed, double price) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Аты: " + name + ", Жашы: " + age + ", Пародасы: " + breed + ", Баасы: " + price);
    }
}
