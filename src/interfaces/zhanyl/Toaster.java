package interfaces.zhanyl;

public class Toaster implements KitchenAppliance {
    @Override
    public void start() {
        System.out.println("Тостер нан кызартып жатат: чик!");
    }
}
