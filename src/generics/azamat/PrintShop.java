package generics.azamat;

public class PrintShop {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.<String>print(new String[] {"Эрлан", "Бекболот", "Ырыскелди"});
        printer.<Integer>print(new Integer[] {1, 2, 3});

        KeyValue<String, Double> keyValue = new KeyValue<>("Баасы", 22.5);
        System.out.println(keyValue.getId());
    }
}
