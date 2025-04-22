package oop.zhanyl;

public class Flower {
    private String name;
    private String color;
    private int price;
    private int quantity;
    public String getName(){
        return name;
    }
    public String getColor (){
        return color ;
    }
    public int getPrice (){
        return price ;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name){
        this .name=name  ;
    }
    public void setColor (String color){
        this.color =color ;
    }
    public void setPrice (int price ){
        if(price >0){
            this .price =price ;
        }
        else{
            System .out .println("Баа 0 ден чоң болушу керек!");
        }
    }
    public int calculateTotalPrice() {
        return price * quantity;
    }
    public void setQuantity (int quantity){
        this.quantity=quantity ;
    }
    public void all() {
        System.out.println(String.format("Гулдун аты: %s, түсү: %s, баасы: %d, саны: %d", name, color,price , quantity));
    }
}
