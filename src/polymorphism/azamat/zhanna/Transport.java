package polymorphism.azamat.zhanna;

//Базалык Transport классы
abstract class Transport {
    // Абстрактуу move() методу
    public abstract void move();

    // Жалпы маалымат үчүн кошумча метод
    public void showInfo() {
        System.out.println("Бул транспорт каражаты");
    }
}