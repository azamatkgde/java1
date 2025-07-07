package variable.azamat;

public class SimpleForm {
    public static void main(String[] args) {
        // Создаем переменные
        String firstName = "Azamat";
        String lastName = "Toktakunov";
        int age = 28;
        boolean hasJob = true;

        // Вывод информации в консоль
        System.out.println("Салам, менин атым " + firstName + " " + lastName + ".");
        System.out.println("Мен " + age + " жаштамын.");
        System.out.println("Иштейминби? " + (hasJob ? "Ооба" : "Жок"));
    }
}