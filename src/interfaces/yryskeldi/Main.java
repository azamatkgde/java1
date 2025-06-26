package interfaces.yryskeldi;

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        Playable drum = new Drum();

        guitar.play();
        piano.play();
        drum.play();
    }
}
