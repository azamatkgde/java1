package oop.zhamal;

public class Staubsauger {

    private String model;
    private  int watt;
    private String farbe;
    private int akku;

    public void clean() {
        System.out.println(" Салам Javanyn жашоочулары \n" +
                " Мен жаны чан соргучка буйрутма бердим . " + " Ал жонундо толук маалымат алдыда: "
        + " \n Чан соргучтун модели  - " + model +"," + " анын тусу " + farbe + " \n батарейкасы " + akku +
                " саатка чыдайт жана " + " кубаттуулугу " + watt + " Вт "
                );



    }
     // Konstruktor

     public Staubsauger( String model, int watt , String farbe, int akku ){
        this.model = model;
        this.watt = watt;
        this.farbe = farbe;
        this.akku = akku;
     }
}

