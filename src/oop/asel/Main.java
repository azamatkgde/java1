package oop.asel;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.race = "Labrador";
        dog.weight = 35;

        dog.sayGav();

        Dog dog2 = new Dog();
        dog2.race = "Ovcharka";
        dog2.weight = 40;

        dog2.sayGav();

        /// ///////////////////////////////////////////////

        Som fifty = new Som();

        fifty.value = 50;
        fifty.color = "orange";

        fifty.newSom();

        /// /////////////////////////////////////////

        Person me = new Person ();

        me.name = "Asel";
        me.age = 29;

        me.sayHello();

        /// /////////////////////////////////////////////////////

        PersonPrivate p = new PersonPrivate();
        p.setName("Abai");
        p.setAge(32);

        p.sayHello();

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        /// //////////////////////////////////////////////////////////////////////////

        Phone apple = new Phone();
        apple.model = "14 pro";
        apple.year = 2024;

        apple.buyPhone();
        /// /////////////////////////////////////////////////////////////////

        CarPrivate toyota = new CarPrivate();

        toyota.setModel("Land Cruiser");
        toyota.setYear(2020);

        toyota.buyCar();


    }
}
