package enums.azamat.marvel;

public class Hero {
    private HeroType type;
    String name;
    String actor;

    public Hero(String name, String actor, HeroType type) {
        this.name = name;
        this.actor = actor;
        this.type = type;
    }

    public String getActor() {
        switch (type) {
            case IRONMAN: return "Темир адам";
            case TOR: return "Тор";
            case CAPITANAMERICA: return "Америка капитаны";
            default: return "Билбейм";
        }
    }
}
