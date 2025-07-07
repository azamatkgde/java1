package api.bachaiy;

public class Country {
    String name;
    String population;
    String languages;
    String capital;
    String president;
    String  currency;
    String description;
    String area;

    public Country(String name,String population,String languages,String capital,String president,String currency,String description,String area){
this.name =name;
this.population = population;
this.languages=languages;
this.capital=capital;
this.president=president;;
this.currency=currency;
this.description=description;
this.area =area;
    }
    public void print(){
        System.out.println("страна:" + name);

        System.out.println("население:" + population);
        System.out.println("языки:" + languages);
        System.out.println("столица:" + capital);
        System.out.println("президент:" + president);
        System.out.println("валюта:" + currency);
        System.out.println("описание:" + description);
        System.out.println("территория:" + area  + "km²");

    }
}

