package interfaces.azhibai;

import java.util.Random;

public class Turtle implements Swimable{

    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        int duration = new Random().nextInt(6) + 3; // 3–8 секунда
        System.out.println(name + " (Ташбакa) " + duration + " секунд жай сүзүп жатат.");
        try {
            Thread.sleep(duration * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rest() {
        System.out.println(name + " (Ташбакa) азыр эс алып жатат.");
    }

    @Override
    public String getName() {
        return name;
    }
}


