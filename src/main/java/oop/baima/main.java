package oop.baima;

public class main  {
    public static void main (String[] args ){
        Person pName  = new Person();
        pName. setName ("Байма");
        pName.setAge (34);

        //pName.sayHello();

        System.out.println("Аты: "+ pName.getName());
        System.out.println("Жашы:"+ pName.getAge());

    }
}
