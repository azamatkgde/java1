package variable.aibek;

import java.time.LocalDate;
import java.time.YearMonth;

public class Versicherung {

    public static void main(String[] args) {
        // Авто камсыздандыруу ID номери
        String kfzVersicherungId =  "KFZ0101";
        // Дарек
        String versicherungObjektAdresse = "Münchener Str 1 , München";
        // Кардардын аты-жөнү
        String kundenName = "Arstanbekov Aibek";
        // Туулган куну жылы
        LocalDate kundenGeburtsdatum = LocalDate.of(1997, 10, 3);
        // Марка авто
        String autoMarka  = "Audi Q3 ";
        // Унаанын чыгарылган жылы
        YearMonth erstzulassung = YearMonth.of(2021, 7);
        // Бензин мененби жэ соляркабы
        String kraftstoff = "Benzin";
        // Канча ат кучу бар
        int leistung = 190;
        // Матордун колому канча
        double hubraum = 2.0;
        // Камсыздандыруунун түрү
        String artVersicherung = "Vollkasko";
        // Жылдык төлөм суммасы
        double jahresbetrag = 899.99 ;
        // Келишим качан башталган
        LocalDate versicherungBeginn = LocalDate.of(2023, 1, 1);
        // Жылына жүрүүчү чакырым
        int kmProJahr = 10000;


        //
        boolean istAktiv = true ;

        //кыргызча маалыматты чыгаруу
        System.out.println("Унаанын камсыздандыруу маалыматы: ") ;
        System.out.println("Камсыздандыруу ID номери: " + kfzVersicherungId ) ;
        System.out.println("Унаа ээсинин дареги: " + versicherungObjektAdresse ) ;
        System.out.println("Унаанын ээси: " + kundenName ) ;
        System.out.println("Туулган куну,жылы: " + kundenGeburtsdatum ) ;
        System.out.println("Унаанын маркасы: " + autoMarka ) ;
        System.out.println("Унаанын чыгарылган жылы: " + erstzulassung );
        System.out.println("Күйүүчү май түрү: " + kraftstoff);
        System.out.println("Ат күчү: " + leistung);
        System.out.println("Мотор көлөмү: " + hubraum + " л");
        System.out.println("Камсыздандыруу түрү: "+ artVersicherung ) ;
        System.out.println("Жылдык төлөм: € "+ jahresbetrag );
        System.out.println("Келишим башталган күн: " + versicherungBeginn);
        System.out.print("Жылына жүрүүчү чакырым: "+ kmProJahr );
        System.out.println( "Камсыздандыруу активдүүбү? " + (istAktiv ? "Ооба" : "Жок"));

    }
}
