// Version 2.0
package oop.omka;

public class Car {
    private String marka;
    private int preis;
    private int year;
    private int model;

    // Бош конструктор
    public Car() {
        this.marka = "Белгисиз";
        this.preis = 0;
        this.year = 1970;
    }

    //Параметрлүү конструктор
    public Car(String marka, int preis) {
        this.marka = marka;
        this.preis = preis;
    }

//    Getter жана Setter
//    public String getMarka() {
//        return marka;
//    }
  //----
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setYear(int year) {
        if (year > 1900 && year < 2025) {
            this.year = year;
        } else {
            System.out.println("Машинанын жылы туура эмес!");
        }
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        if (preis > 0) {
            this.preis = preis;
        } else {
            System.out.println();
        }
    }

    public void all() {
        System.out.println("Машинанын маркасы: " + marka + ", баасы: " + preis + " доллар турат.");
    }
}
