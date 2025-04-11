package basics.asan;

public class Cat {
    private String name;
    private String light;
    private int age;

    public Cat(String name, String light, int age) {
        this.name = name;
        this.light = light;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLight() {
        return light;
    }

    public int getAge() {
        return age;
    }

    public void profilCat(){
        System.out.println("Аты: " + name);
        System.out.println("Түсү: " + light);
        System.out.println("Жашы: " + age);
    }
}