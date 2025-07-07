package oop.zhamal;

public class Koen{
    private int alt;
    private String name;
    private String lieblingsEssen;
    private boolean kannSpringen;

    // Meine methode

    public void schnellRennen(){
        System.out.println(" Hallo an alle , meine Hase ist " + alt +
                " Jahre alt ." + " Ich nenne sie " + name + " . " +
                " Sie magt gerne " + lieblingsEssen + " \n Sie " +
                "  Sie kann bis 2 Meter hoch springen " + kannSpringen);


    }


    // Setter
    public void setAlt(int alt ) {
        this.alt = alt;
    }

    public  void setName(String name ){
        this.name = name;
    }

    public void  setKannSpringen( boolean kannSpringen ) {
        this.kannSpringen = kannSpringen;
    }

    public  void setLieblingsEssen( String lieblingsEssen ) {
        this.lieblingsEssen = lieblingsEssen ;
    }
}



