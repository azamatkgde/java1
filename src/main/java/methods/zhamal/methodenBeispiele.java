package methods.zhamal;

public class methodenBeispiele {
    public static void main(String[] args) {
        brief();
        adressen();
        int summe = multiplizieren(10,870);
        System.out.println(" Sie werden  in 10 Tagen " + summe + " euro verdienen .");
        arbeit() ;


    }

    public static void brief() {
        int personal = 30;
        System.out.println(" Sehr geehrte Damen und Herren ," +
                "  Wir benötigen für unsere Firma " + personal + " neue Mitarbeiter ");
    }


    static void adressen() {
        String strassen = (" Müllerstraße ,  Moonstraße, Nürnbergergerstraße, Berlinerstraße .");
        System.out.println(" 4 wichtige Hauptfilialen  sind in : " + strassen);

    }
    public static int multiplizieren(int j, int u){
        return j*u;
    }
    public static void arbeit (){
    int alt = 22;
    boolean a = alt >= 19;
        System.out.println( " Wenn sie über 22 Jahre alt sind , dann dürfen sie arbeiten " + a);
    }


}




