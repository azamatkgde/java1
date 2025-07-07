package oop.azamat;

public class DogImpl {
    public static void main(String[] args) {
        boolean trumpPresident = true;

        Dog jackie = new Dog();
        /*jackie.race = "Лабрадор";
        jackie.weight = 25;
        jackie.name = "Jackie";*/

        jackie.setRace("Лабрадор");
        jackie.setWeight(3);

        if (trumpPresident) {
            jackie.setCanNotEat(true);
        } else {
            jackie.setCanNotEat(false);
        }

        System.out.println(jackie.getCanNotEat());

    }
}
