package enums.aibek.weather;

public class Main {
    public static void main(String[] args) {
        Weather today = Weather.RAINY;

        if( today == Weather.SUNNY){
            System.out.println("Бугун кун ачык!");
        } else if (today == Weather.RAINY){
            System.out.println("Бугун жамгыр жаап жатат!");

        }
    }
}
