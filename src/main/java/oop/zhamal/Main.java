package oop.zhamal;

public class Main {
    public static void main ( String[]args){
        Koen a = new Koen ();
        a.setAlt(3);
        a.setName(" Tentek");
        a.setLieblingsEssen("Karotten und frische Salat");
        a.setKannSpringen(true);

        a.schnellRennen() ;

        Staubsauger neue = new Staubsauger
                ("daison" , 1200,"braun",4) ;

        neue.clean ();



    }

}
