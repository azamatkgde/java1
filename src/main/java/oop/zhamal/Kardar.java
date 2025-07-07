package oop.zhamal;

public class Kardar {

     private long nomer;
     private String adress;
     private int jaschy;
     private String tolooKartasy;

     public Kardar ( long nomer, String adress, int jaschy , String tolooKartasy ){
         this.nomer = nomer;
         this.adress = adress;
         this.jaschy = jaschy;
         this.tolooKartasy = tolooKartasy ;
     }

    public String getAdress() {
        return adress;
    }

    public int getJaschy() {
        return jaschy;
    }

    public long getNomer() {
        return nomer;
    }

    public String getTolooKartasy() {
        return tolooKartasy;
    }

    public void belgisizKardar (){
         System.out.println( " Kardar " + jaschy + " jashta . " +  " Anyn aktualduu jaschagan jeri   " + adress +
         " Jeke nomeri - " + nomer + ". Kardar en tez bolgon " + tolooKartasy + " arkyluu kotoro alat ." ) ;
     }
}
