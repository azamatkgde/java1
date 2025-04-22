package api.zhanyl;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args){
        CoffeeService coffeeService =new CoffeeService();
        coffeeService.addCoffee(new Coffee("Espresso",2.2,"орточо"));
        coffeeService .addCoffee(new Coffee("Cappuccino",3.2,"орточо"));
        coffeeService .addCoffee(new Coffee("Latte",3.5,"орточо"));
        System.out.println("Менюда бар кофелер:");
    for (Coffee coffee :coffeeService.getAllCoffees()){
        coffee .showInfo() ;
    }
    Scanner scanner =new Scanner(System.in );
        System.out.print("\nКандай кофе издегиңиз келет? Атын жазыңыз: ");
        String searchName = scanner.nextLine();

    System .out .println("Изделген кофе:");
    Coffee found = coffeeService.getCoffeeByName(searchName);
    if (found !=null){
        found .showInfo();
    }else {
        System .out .println("Мындай кофе табылган жок!");
    }
    }
}