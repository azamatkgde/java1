package enums.aibek.carType;

public class Main {
    public static void main(String[] args) {
        CarType myCar = CarType.COUPE;

        if (myCar == CarType.SEDAN){
            System.out.println(" Сиз седан унаасын тандадыныз");
        }else if (myCar == CarType.SUV){
            System.out.println("Сиз жол тандабас унаасын тандадыныз");

        }else {
            System.out.println("Бул усту ачык унаа");

        }
    }
}
