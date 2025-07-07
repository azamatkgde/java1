package abstractclass.erlan;

public class Barcelona extends FootballClub {

    public Barcelona() {
        super("FC Barcelona", 1899);
    }

    @Override
    public void chant() {
        System.out.println("Visca el Barça! Visca Catalunya!");
    }
}

