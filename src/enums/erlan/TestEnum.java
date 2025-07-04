package enums.erlan;

public class TestEnum {
    public static void main(String[] args) {
        Oblast myOblast = Oblast.BATKEN;

        System.out.println("Облус: " + myOblast);
        System.out.println("Борбору: " + myOblast.getCenter());
        System.out.println("Калкы: " + myOblast.getPopulation() + " адам");
        System.out.println("Аянты: " + myOblast.getArea() + " км²");

        System.out.print("Мүнөздөмөсү: ");
        switch (myOblast) {
            case CHUY -> System.out.println("Өлкөнүн борбору жайгашкан, экономикалык борбор.");
            case OSH -> System.out.println("Түштүк тараптагы ири шаар, маданий борбор.");
            case JALAL_ABAD -> System.out.println("Токойлор жана дары суулар менен бай.");
            case NARYN -> System.out.println("Тоолуу, мал чарбачылыгы өнүккөн.");
            case TALAS -> System.out.println("Манас эпосунун мекени, тарыхый мааниге ээ.");
            case BATKEN -> System.out.println("Чек арада жайгашкан, стратегиялык маанилүү.");
            case YSYK_KOL -> System.out.println("Туризмге бай аймак, Ысык-Көлү менен белгилүү.");
        }
    }
}