package interfaces.azamat.player;

public class Boy implements Player {

    @Override
    public void play() {
        System.out.println("Бала буту менен ойноп жатат");
    }

    @Override
    public void stop() {

    }

    @Override
    public void go() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void championship() {
        System.out.println("Клубный чемпионат миранын условиялары бул жерде");
    }
}
