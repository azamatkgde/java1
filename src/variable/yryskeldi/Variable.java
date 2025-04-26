package variable.yryskeldi;

public class Variable {
    public static void main (String[] args) {
        System.out.println("Hello zusammen!!!");
        String name = "Yryskeldi ";
        String nachname = "Talipov ";
        String vaterland = "Bakytovich";
        System.out.println("Ich bin" + nachname + name + vaterland);
        int age = 19;
        System.out.println("Ich bin " + age);
        String uni = "I.Razzakova.";
        System.out.println("Ich studiere in Uni " + uni);
        String hobby = "Valleybal ";
        System.out.println("Mein Hobby ist " + hobby + "spielen.");

        boolean istStudent = true;
        boolean istArbeiter = true;
        System.out.println("Bist du ein Student? " + (istStudent || istArbeiter));
        System.out.println("Bist du ein Arbeiter? " + (istStudent && istArbeiter));

    }
}
