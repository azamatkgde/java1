package oop.zhanna.ConsoleApp;

public class AgeStatisticsApp {
    // Encapsulated Person class with private fields and getters/setters
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    // Method to determine age category using if-else
    public static String ageCategory(int age) {
        if (age < 13) {
            return "Балдар";
        } else if (age < 20) {
            return "Өспүрүм";
        } else if (age < 60) {
            return "Үй-бүлөлүк";
        } else {
            return "Улуу жаштагы";
        }
    }
}
