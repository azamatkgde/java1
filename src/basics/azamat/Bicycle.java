package basics.azamat;

public class Bicycle extends Transport {
  private String type;

  // Конструктор
  public Bicycle(String model, String type) {
    super(model); // Bicycle үчүн
    this.type = type;
  }

  // Геттер
  public String getType() {
    return type;
  }

  // Метод
  public void printInfo() {
    super.printInfoTransport(); // Transport'тон чакырат
    System.out.println("Велосипеддит түрү: " + type);
  }
}
