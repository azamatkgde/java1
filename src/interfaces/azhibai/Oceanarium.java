package interfaces.azhibai;

import java.util.ArrayList;
import java.util.List;

public class Oceanarium {
    private List<Swimable> swimmers;

    public Oceanarium() {
        swimmers = new ArrayList<>();

        // 5 Акулa
        for (int i = 1; i <= 5; i++) {
            swimmers.add(new Shark("Акулa #" + i));
        }

        // 5 Өрдөк
        for (int i = 1; i <= 5; i++) {
            swimmers.add(new Duck("Өрдөк #" + i));
        }

        // 5 Ташбакa
        for (int i = 1; i <= 5; i++) {
            swimmers.add(new Turtle("Ташбакa #" + i));
        }
    }

    public void show() {
        for (Swimable swimmer : swimmers) {
            swimmer.swim();
            swimmer.rest();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Oceanarium oceanarium = new Oceanarium();
        oceanarium.show();
    }
}


