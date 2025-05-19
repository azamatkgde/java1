package basics.turat;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineCourse {
    // **OOP: Класстык модель түзүү**
    static class Course {
        String name;
        double price;

        public Course(String name, double price) {
            // **OOP: Конструктор - Объект жаратылып, маалымат берилүүдө**
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " - с" + price; // **Мындай метод OOPдагы полиморфизм мисалы**
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // **ArrayList (Framework): Массивдерди жана динамикалык тизмелерди база катары колдонуу**
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Course> cart = new ArrayList<>();
        boolean exit = false;

        // **Массив (Array): Static листтен мисалы кошуп берүү**
        Course[] predefinedCourses = {
            new Course("Java Basics", 50.0),
            new Course("Advanced Java", 70.0),
            new Course("Web Development", 30.0),
            new Course("Data Structures and Algorithms", 60.0)
        };

        // **for цикли: Массивди бирден кошуу үчүн for цикли колдонулат**
        for (Course course : predefinedCourses) {
            courses.add(course);
        }

        System.out.println("Он-лайн Курс сатуу программасы");
        while (!exit) { // **while цикли: Программа "чыгуу" басылганга чейин иштей берет, ал эми чыгуу үчүн 4 дегенди басуу керек**
            System.out.println("\nТаңдоолор:");
            System.out.println("1. Курстарды көрүү");
            System.out.println("2. Курстарды сатып алуу");
            System.out.println("3. Корзинадагы курстар");
            System.out.println("4. Программага чыгуу");

            System.out.print("Тандооңуз: ");
            int choice = scanner.nextInt();

            // **if-else: Колдонуучунун тандоосуна жараша иш-аракеттерди аныктоо**
            if (choice == 1) {
                System.out.println("\nУчурда бар курстар:");
                
                // **for цикли: Курстарды экранга чыгарууда**
                for (int i = 0; i < courses.size(); i++) {
                    System.out.println((i + 1) + ". " + courses.get(i));
                }

                System.out.print("\nКошууга курстун номерин жазыңыз (0 - артка): ");
                int courseChoice = scanner.nextInt();
                
                // **if: Киргизилген номерди текшерүү**
                if (courseChoice > 0 && courseChoice <= courses.size()) {
                    cart.add(courses.get(courseChoice - 1)); // **OOP: Объектти динамикалык корзинага кошуу**
                    System.out.println(courses.get(courseChoice - 1).name + " корзинага кошулду!");
                }
            } else if (choice == 2) {
                if (cart.isEmpty()) { // **if-else: Корзинанын боштугун текшерүү**
                    System.out.println("\nКорзина бош!");
                } else {
                    double total = 0;

                    System.out.println("\nСиз сатып алган курстар:");
                    
                    // **for цикли: Корзинадагы товарларды экранга чыгаруу**
                    for (Course course : cart) {
                        System.out.println("- " + course);
                        total += course.price; // Жалпы сумманы эсептөө
                    }

                    System.out.println("Жалпы сумма: с" + total);
                    cart.clear();
                    System.out.println("Рахмат! Сиз курстарды сатып алдыңыз.");
                }
            } else if (choice == 3) {
                if (cart.isEmpty()) {
                    System.out.println("\nКорзина бош.");
                } else {
                    System.out.println("\nУчурдагы корзина:");
                    for (Course course : cart) {
                        System.out.println("- " + course);
                    }
                }
            } else if (choice == 4) {
                exit = true; // **if: Чабыттан чыгуу үчүн туруктуу өзгөрмө "true" болот**
                System.out.println("Программа бүттү. Сизге ийгилик каалайбыз!");
            } else {
                System.out.println("Туура тандоо эмес! Кайра аракет кылып көрүңүз.");
            }
        }

        scanner.close();
    }
}