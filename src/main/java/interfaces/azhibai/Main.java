package interfaces.azhibai;

public class Main {
    public static void main(String[] args) {
        System.out.println("Океанариумга кош келиңиздер!");
        System.out.println("Бүгүн сууга түшө турган жаныбарлар даяр");
        System.out.println("--------------------------------------------------");

        Oceanarium oceanarium = new Oceanarium();

        // Кичине күтүү (эффект үчүн)
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Шоу башталды! Жаныбарлар сууга түшүп жатышат...");
        System.out.println();

        oceanarium.show(); // Ар бир жаныбар сүзүп, анан эс алат

        System.out.println("--------------------------------------------------");
        System.out.println(" Шоу аяктады. Бардык жаныбарлар эс алып жатат.");
        System.out.println("Келгендериңизге рахмат!");
    }

}
