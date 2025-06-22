package interfaces.Bekbolot;

public class Chess extends Game implements Playable {

    @Override
    public void start() {
        System.out.println("Игра началась!");
    }

    @Override
    public void play() {
        System.out.println("Ходим фигурами...");
    }
}