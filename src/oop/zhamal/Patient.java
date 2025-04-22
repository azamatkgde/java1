package oop.zhamal;

public class Patient extends Kardar {

    private String jynysy ;
    private String kandynToptoru;
    private int salmagy;

    public Patient(long nomer, String adress, int jaschy , String tolooKartasy ,
                   String jynysy , String kandynTobu ,int salmagy  ){
        super(nomer, adress,jaschy ,tolooKartasy );
        this.jynysy = jynysy ;
        this.kandynToptoru =kandynTobu ;
        this.salmagy = salmagy ;
    }

    public void belgisizKardarJePatient(){
        super.belgisizKardar();
        System.out.println ( " Jynysy  " + jynysy + " Aga  "
                + kandynToptoru + " Gruppadagy kan  tuura kelet. " + "  Cave: Anyn "  + salmagy +
                "  kg salmagyna  anasthesiany tuura karoo  kerek . ");
    }


    }


