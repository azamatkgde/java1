package abstractclass.erlan;

public class RealMadrid extends FootballClub {

    public RealMadrid() {
        super("Real Madrid CF", 1902);
    }

    @Override
    public void chant() {
        System.out.println("¡Hala Madrid! ¡Y nada más!");
    }
}


