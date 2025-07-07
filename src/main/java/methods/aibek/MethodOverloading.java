package methods.aibek;

public class MethodOverloading {
    public static void main(String[] args) {
        int result1 =  add(10,20);
        double result2 = add(8.4, 3.5);
        System.out.println("Жыйынтык: " + result1 ) ;
        System.out.println("Жыйынтык: " + result2 ) ;
    }
    // int параметрлер үчүн метод
    public static int add(int x,int y){
        return   x + y;

    }
    // double параметрлер үчүн метод
    public static double  add(double  x,double  y){
        return  x + y;

    }//Методдорду ашыкчалоо программаны ийкемдүү кылат, анткени бирдей логика ар башка түрлөр үчүн колдонулат.
}
