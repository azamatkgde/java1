package interfaces.zhanyl;

public class Microwave implements KitchenAppliance {
    @Override
    public void start() {
        System.out.println("Микроволновка ысытып жатат: пип-пип!");
    }
}
