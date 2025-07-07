package abstractclass.aizat;

public class France extends Country {
    public France (String name, String continent) {
        super(name, continent);
    }

    @Override
    void showCulture() {
        System.out.println("Французская культура: круассаны, мода, Эйфелева башня, живопись, вино.");
    }
}
