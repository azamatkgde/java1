package oop.erlan;

public class FootballClub {
    String name;
    String liga;
    String country;
    int score;
    int player;
    int championsLeague;


    //    Методы:

    public void clubs() {
        if (score >= 20) {
            System.out.println("Название клуба: " + name + "\n" + "Какая лига: " + liga + "\n" + "Страна: " + country +
                    "\n" + "Сколько очков: " + score + "\n" + "Беллингем выступает под номером: " + player + "\n" +
                    "Титул лиги чемпионов: " + championsLeague);
            System.out.println("<<Высшая лига>>");
        } else {
            System.out.println("<<Не квалифирован>>");
            System.out.println();

        }
        System.out.println(" ");
        System.out.println("<<<<<<<<<<<<<<<<<<< Следующий объект >>>>>>>>>>>>>>>>>>>>");
        System.out.println(" ");

    }

    public void ball() {
        System.out.println("Название клуба: " + name + "\n" + "Какая лига: " + liga + "\n" + "Страна: " + country +
                "\n" + "Сколько очков: " + score + "\n" + "Кожо играет под номером: " + player + "\n" +
                "Титул ЛЧ: " + championsLeague);

        System.out.println(" ");
        System.out.println("<<<<<<<<<<<<<<<<<<< Следующий объект >>>>>>>>>>>>>>>>>>>>");
        System.out.println(" ");


    }
}
