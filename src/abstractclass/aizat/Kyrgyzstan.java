package abstractclass.aizat;

public class Kyrgyzstan extends Country{
    public Kyrgyzstan (String name, String continent){
        super(name, continent);
    }

    @Override
    void showCulture(){
        System.out.println("Кыргызская культура: боз үй, кымыз, ооз комуз, той, манасчы.");
    }
}
