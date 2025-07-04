package enums.azamat.marvel;

public class About {
    public static void main(String[] args) {
        Hero h1 = new Hero("Железный человек", "Роберт Даун мл", HeroType.IRONMAN);

        System.out.printf("Hero '%s' played by %s is a %s\n",
                h1.name, h1.actor, h1.getActor());
    }
}
