package abstractclass.aizat;

public abstract class Country {
    protected String name;
    protected String continent;

    public Country (String name, String continent){
        this.name = name;
        this.continent = continent;
    }

    abstract void showCulture();

     void displayInfo() {
         System.out.println("Страна: " + name);
         System.out.println("Континент: " + continent);
     }
}
