package oop.asan;

public class SellCat  extends Cat{
    private int prise;
    private int prise1;
    private String location;

    // конструктор
    public SellCat(String light,String type,int age,double weight,int prise,int prise1,String location){
        super(light ,type,age,weight);
        this.prise = prise;
        this.prise1 = prise1;
        this.location = location;
    }

    public int getPrise(){
            return prise;
    }

    public int getPrise1() {
        return prise1;
    }

    public String getLocation(){
        return location;
    }
    public void printSellCat1(){
            super.catOrigins();
            System.out.println("Баасы " + prise  + "-" + prise1 + " доллар");
            System.out.println( "Жайгашкан жери: " + location);
    }
    public void printSellCat2(){
        super.catOrigins();
        System.out.println("Баасы " + prise  + "-" + prise1 +  " доллар");
        System.out.println( "Жайгашкан жери: " + location);
    }


}
