package basics.zhamal;

public class TVundAudio extends AngebotProdukte {

    private double preis;
    private boolean verfügbarkeit;

    public TVundAudio(String model, double zoll, boolean bluetooth, double preis, boolean verfügbarkeit) {
        super(model, zoll, bluetooth);
        this.preis = preis;
        this.verfügbarkeit = verfügbarkeit;
    }

    public boolean getVerfügbarkeit() {
        return verfügbarkeit;
    }

    public double getPreis() {
        return preis;
    }

    public void Elektroabteilung() {
        super.info();
        System.out.println(" Liebe Java Kunden, 50% Rabatt gilt nur für heute!");
        System.out.println(" Aktueller Preis: " + preis + " $");
        System.out.println("✔ Verfügbar: " + (verfügbarkeit ? "Ja ✅" : "Nein ❌"));
    }

    public void info() {
        super.info();
        System.out.println(" Preis: " + preis + " $");
        System.out.println(" Verfügbar: " + (verfügbarkeit ? "Ja ✅" : "Nein ❌"));
    }
}
