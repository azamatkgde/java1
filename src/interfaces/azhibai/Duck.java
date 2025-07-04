package interfaces.azhibai;

import java.util.Random;

public class Duck implements Swimable{

private String name;

public Duck(String name) {
    this.name = name;
}

@Override
public void swim() {
    int duration = new Random().nextInt(4) + 2; // 2–5 секунда
    System.out.println(name + " (Өрдөк) " + duration + " секунд жай сүзүп жатат.");
    try {
        Thread.sleep(duration * 1000L);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

@Override
public void rest() {
    System.out.println(name + " (Өрдөк) азыр эс алып жатат.");
}

@Override
public String getName() {
    return name;
}
}
