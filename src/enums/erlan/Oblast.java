package enums.erlan;

public enum Oblast {
    CHUY("Bishkek", 974000, 19800),
    OSH("Osh", 1364000, 29100),
    JALAL_ABAD("Jalal-Abad", 1291000, 33200),
    NARYN("Naryn", 292000, 45300),
    TALAS("Talas", 276000, 11800),
    BATKEN("Batken", 558000, 17000),
    YSYK_KOL("Karakol", 501000, 43100);

    private final String center;
    private final int population;
    private final int area;


    Oblast(String center, int population, int area) {
        this.center = center;
        this.population = population;
        this.area = area;
    }


    public String getCenter() {
        return center;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }
}

