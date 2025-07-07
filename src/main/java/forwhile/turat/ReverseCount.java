package forwhile.turat;

public class ReverseCount {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i > 1) {
                System.out.println("Тескери: " + i);
            } else {
                // Бул акыркы сан – 1 чыккандан кийин, жыйынтык билдирүү чыгат
                System.out.println("Тескери: " + i);
                System.out.println("Тескери эсеп аяктады.");
            }
        }
    }
}

