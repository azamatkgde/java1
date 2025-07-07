package variable.bekbolot;

import java.util.Scanner;

public class Variable {

    // Бул метод true/false'ту Ооба/Жок кылып өзгөртөт
    public static String translateBoolean(boolean value) {
        return value ? "Ооба" : "Жок";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ар кандай түрдөгү өзгөрмөлөрдү түзүү (Колдонучудан суроо)
        System.out.print("Атыңызды киргизиңиз: ");
        String atyJonu = scanner.nextLine();    // Аты

        System.out.print("Фамилияңызды киргизиңиз: ");
        String lastName = scanner.nextLine();   // Фамилия

        System.out.print("Жашыңызды киргизиңиз: ");
        int age = scanner.nextInt();            // Жаш

        scanner.nextLine(); // ! Тазалоо

        System.out.print("Жумушуңуз барбы? (Ооба/Жок): ");
        String jobAnswer = scanner.nextLine().trim(); // Жумушу барбы
        boolean hasJob = jobAnswer.equalsIgnoreCase("Ооба");

        System.out.print("Боюңузду киргизиңиз (метр менен): ");
        double height = scanner.nextDouble();   // Бою

        scanner.nextLine(); // <- Тазалоо антени nextDouble'дан кийин nextLine туура иштеш үчүн

        System.out.print("Жынысыңызды киргизиңиз (M/F): ");
        String gender = scanner.nextLine();     // Жынысы (строкой)

        // 2. Жонокой математика
        int currentYear = 2025;
        int birthYear = currentYear - age;

        // 3. Шарттарды текшерүү
        boolean isAdult = age >= 18;
        boolean perfectHeight = height >= 1.80;
        boolean differentAge = age != 30;
        boolean adultAndHasJob = isAdult && hasJob;
        boolean adultOrTall = isAdult || height > 1.80;
        boolean noJob = !hasJob;

        // 4. Натыйжаларды экранга чыгарабыз
        System.out.println("\n----- Анкета -----");
        System.out.println("Аты: " + atyJonu + " " + lastName);
        System.out.println("Жашы: " + age);
        System.out.println("Туулган жылы: " + birthYear);
        System.out.println("Жумушу барбы? " + translateBoolean(hasJob));
        System.out.println("Бою: " + height + " м");
        System.out.println("Жынысы: " + gender);

        System.out.println("\n----- Шарттарды текшерүү -----");
        System.out.println("Жашы жеткен? " + translateBoolean(isAdult));
        System.out.println("Идеалдуу бою? " + translateBoolean(perfectHeight));
        System.out.println("Жашы 30дан айырмаланат? " + translateBoolean(differentAge));
        System.out.println("Жашы жеткен жана жумушу барбы? " + translateBoolean(adultAndHasJob));
        System.out.println("Жумушу жокпу? " + translateBoolean(noJob));

        // 5. if-else менен логикалык операторлорду колдонуу
        System.out.println("\n----- Кошумча текшерүү -----");

        if (adultAndHasJob) {
            System.out.println("Сиз жашы жеткенсиз жана жумушуңуз бар. Азаматсыз!");
        } else if (isAdult && !hasJob) {
            System.out.println("Сиз жашы жеткенсиз, бирок жумушуңуз жок. Иш издөө керек!");
        } else {
            System.out.println("Сиз жашы жеткен эмессиз же башка шарттар аткарылган жок.");
        }

        if (adultOrTall) {
            System.out.println("Сиз жашы жеткен же боюңуз узун экен!");
        } else {
            System.out.println("Сиз жашы жеткен эмес жана боюңуз 1.80мден төмөн.");
        }

        if (gender.equalsIgnoreCase("M")) {
            System.out.println("Сиз эркек экенсиз.");
        } else if (gender.equalsIgnoreCase("F")) {
            System.out.println("Сиз аял экенсиз.");
        } else {
            System.out.println("Жынысы туура эмес киргизилген.");
        }

        System.out.println("\nТиптердин MAX чыгаруу:");
        System.out.println("byte: " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MAX_VALUE);
        System.out.println("Char: " + (int) Character.MAX_VALUE);

        scanner.close(); // Scanner жабуу
    }
}
