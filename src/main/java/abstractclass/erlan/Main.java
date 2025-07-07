package abstractclass.erlan;

public class Main {
    public static void main(String[] args) {
        FootballClub barca = new Barcelona();
        FootballClub madrid = new RealMadrid();

        barca.showInfo();      // Club: FC Barcelona, Год основания: 1899
        barca.chant();         // Visca el Barça! Visca Catalunya!
        barca.playMatch();     // FC Barcelona играет в чемпионате Испании (La liga)

        System.out.println();

        madrid.showInfo();     // Club: Real Madrid CF, Год основания: 1902
        madrid.chant();        // ¡Hala Madrid! ¡Y nada más!
        madrid.playMatch();    // Real Madrid CF играет в чемпионате Испании (La liga)
    }
}