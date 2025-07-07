package variable.aibek;

public class Kredit {

    public static void main(String[] args) {
        // Кредит ID номери
        String kreditId = "CRD010101";
        // Кардардын аты-жону
        String kundenName = "Andy Pffeifer";
        // Кардардын дареги
        String kundenAdresse = "Schliersee Str 2, Hamburg";
        // Кредит суммасы (€)
        double kreditBetrag = 20000.00;
        // Пайыздык чен (%)
        double kreditZins = 5.5;
        // Кредит мооноту (ай менен)
        int laufZeit = 60;
        // Ай сайын толонуучу сумма
        double monatlicheRate = 399.99;
        // Кредит алынган жыл
        int kreditStartJahr = 2025;
        // Кредит активтуубу?
        boolean isAktiv = true ;


        // Кредит тууралу маалымат чыгаруу;
        System.out.println("Банктык кредит тууралуу маалымат:");
        System.out.println("Кредит ID: " + kreditId );
        System.out.println("Кардардын аты жону: " + kundenName );
        System.out.println("Кардардын дареги: " + kundenAdresse );
        System.out.println("Кредит суммасы: €" + kreditBetrag );
        System.out.println("Пайыздык чен: %" + kreditZins );
        System.out.println("Кредит мооноту: " + laufZeit );
        System.out.println("Айлык толом:  €" + monatlicheRate  );
        System.out.println("Кредит алынган жыл: " + kreditStartJahr  );
        System.out.println("Кредит активдуубу? " + (isAktiv ? "Ооба" : "Жок")) ;

    }
}
