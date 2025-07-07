package oop.aizat;

public class main {
    public static void main(String[] args){
      OOPPerson pName = new OOPPerson();
      pName.setName("Aizat");
      pName.setAge(25);

      //pName.sayHello();

      System.out.println("Аты:" + pName.getName());
      System.out.println("Жашы:" + pName.getAge());

    }
}
