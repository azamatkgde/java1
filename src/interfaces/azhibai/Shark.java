package interfaces.azhibai;

import java.util.Random;

public class Shark implements Swimable {

    private String name;

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        int duration = new Random().nextInt(5) + 1; // 1–5 секунда
        System.out.println(name + " (Акулa) " + duration + " секунд сүзүп жатат.");
        try {
            Thread.sleep(duration * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rest() {
        System.out.println(name + " (Акулa) азыр эс алып жатат.");
    }

    @Override
    public String getName() {
        return name;
    }
}

