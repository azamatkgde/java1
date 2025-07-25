package interfaces.aibek.playable;

public class Main {
    public static void main(String[] args) {
        Gitara gitara = new Gitara();
        Piano piano = new Piano();
        Drum drum = new Drum();
        gitara.play();
        piano.play();
        drum.play();
    }
}
