package variable.yryskeldi;

public class Variable {
    public static void main (String[] args) {
        System.out.println("Hello zusammen!!!");
        String name = "Yryskeldi ";
        String Nachname = "Talipov ";
        String Vaterland = "Bakytovich";
        System.out.println("Ich bin" + Nachname + name + Vaterland);
        int age = 19;
        System.out.println("Ich bin " + age);
        String Uni = "I.Razzakova.";
        System.out.println("Ich studiere in Uni " + Uni);
        String hobby = "Valleybal ";
        System.out.println("Mein Hobby ist " + hobby + "spielen.");

        boolean istStudent = true;
        boolean istArbeiter = false;
        System.out.println("Bist du ein Student? " + (istStudent || istArbeiter));
        System.out.println("Bist du ein Arbeiter? " + (istStudent && istArbeiter));

    }
}
