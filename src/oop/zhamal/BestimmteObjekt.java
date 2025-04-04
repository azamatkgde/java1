package oop.zhamal;

public class BestimmteObjekt {
    public static  void main ( String[] args){

        System.out.println(" <<<<<<<<<<<< Phone Samsung <<<<<<<<<<" );
        Phone phone = new Phone(" Samsung", " S21 ",   1200.99);
        phone.printInfo() ;

        System.out.println( " <<<<<<<<<<<<<< Smartphone iPhone >><<<<<<<<<<");

        Smartphone smartphone = new Smartphone(" iPhone ", " 16 Pro ", 2200, true, false);
        smartphone.printInfo() ;
        smartphone.printSmartphoneInfo() ;



    }
}