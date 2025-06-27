package abstractclass.aizat;

public class Main {
    public static void main (String[] args){
        SouthKorea seoul  = new SouthKorea("Южная Корея", "Азия");
        France paris = new France("Франция", "Европа");
        Kyrgyzstan bishkek = new Kyrgyzstan("Кыргызстан", "Азия");

        seoul.displayInfo();
        seoul.showCulture();

        System.out.println("---------------------------------------------------------------------");

        paris.displayInfo();
        paris.showCulture();

        System.out.println("---------------------------------------------------------------------");

        bishkek.displayInfo();
        bishkek.showCulture();
    }
}
