package variable.elmirbek;

public class Variable {

    public static  void main (String[] args) {

        // про себя
        String name  = "Elmirbek";
        int age = 19;
        float height = 1.80f;
        boolean isStudent = true;
        boolean hasJobs = true;
        boolean likesJava = true;
        boolean likesPython = false;

        // вывод
        System.out.println("Имя : " + name);
        System.out.println("Возраст : " + age);
        System.out.printf("Рост: %.2f m%n", height);
        System.out.println("Студент : " + isStudent);
        System.out.println("Работа : " + hasJobs);
        System.out.println("Фанат Java : " + likesJava);
        System.out.println("Фанат Python : " + likesPython);

        // Арифметика логические выражения
        byte groupA = 10;
        byte groupB = 20;
        int sum = groupA + groupB;
        System.out.printf("Колличество студентов в группе JavaA и JavaB : %d %n", sum);

        int agePerson  = 19;
        System.out.printf("Тебе %d : ", agePerson);
        if (agePerson < 13) {
            System.out.println("Вы ещё ребёнок. Вперёд — к знаниям и открытиям!");
        } else if (agePerson < 18) {
            System.out.println("Ты молодой. Прекрасное время учиться и мечтать.");
        } else if (agePerson <= 30) {
            System.out.println("Время строить своё будущее и открывать мир.");
        } else if (agePerson <= 60) {
            System.out.println("У вас богатый опыт и много возможностей.");
        } else {
            System.out.println("Вы мудры, и ваше мнение особенно ценно.");
        }

        // вывод (MAX, MIN)
        System.out.println("Byte MAX : " + Byte.MAX_VALUE);
        System.out.println("Byte MIN : " + Byte.MIN_VALUE);
        System.out.println("Short MAX : " + Short.MAX_VALUE);
        System.out.println("Short MIN : " + Short.MIN_VALUE);
        System.out.println("Int MAX : " + Integer.MAX_VALUE);
        System.out.println("Int MIN : " + Integer.MIN_VALUE);
        System.out.println("Long MAX : " + Long.MAX_VALUE);
        System.out.println("Long MIN : " + Long.MIN_VALUE);
    }
}
