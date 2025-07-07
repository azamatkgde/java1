package basics.zhamal;

public class AngebotProdukte {

    private String model;
    private double zoll;
    private boolean bluetooth;

    public AngebotProdukte(String model, double zoll, boolean bluetooth) {
        this.model = model;
        this.zoll = zoll;
        this.bluetooth = bluetooth;
    }

    public String getModel() {
        return model;
    }

    public double getZoll() {
        return zoll;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void info() {
        System.out.println("<<< Die besten Angebote und Aktionen nur für Java Lernende! >>>");
        System.out.println(" Modell: " + model);
        System.out.println(" Größe: " + zoll + " Zoll");
        System.out.println(" Bluetooth: " + (bluetooth ? "Ja ✅" : "Nein ❌"));
    }
}

