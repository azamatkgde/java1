package generics.erlan;

public class Main {
    public static void main(String[] args) {

        Holder<String> stringHolder = new Holder<>();
        stringHolder.setData("Java - бул келечектин ачкычы!");
        stringHolder.printData();

        Holder<Integer> intHolder = new Holder<>();
        intHolder.setData(2025);
        intHolder.printData();

        Person p = new Person("Омкабек");
        Holder<Person> personHolder = new Holder<>();
        personHolder.setData(p);
        System.out.println("Адамдын аты: " + personHolder.getData().getName());
    }
}