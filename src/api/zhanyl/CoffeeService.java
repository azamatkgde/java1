package api.zhanyl;
import java.util.ArrayList;
import java.util.List;
public class CoffeeService {
    private List<Coffee> coffeeMenu = new ArrayList<>();
    public void addCoffee(Coffee coffee) {
        coffeeMenu.add(coffee);
    }
    public List<Coffee> getAllCoffees() {
        return coffeeMenu ;
    }
    public Coffee getCoffeeByName(String name) {
        for (Coffee coffee : coffeeMenu) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                return coffee;
            }
        }

    return null;
    }
}