package oop.urmat;

public class Person {
   private String name;
   private int age;

    //Getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >= 0 && age < 150){
            this.age = age;
        } else {
            System.out.println("Ошибка: некорректный возраст!");
        }
    }

    public void sayHello(){
        System.out.println("Привет! Меня зовут " + name + ". Мне " + age + " лет." );
    }
}
