package Enum.Bekbolot;

public enum Season {
    WINTER,
    FRUEHLING,
    SOMMER,
    HERBST;

    public static String getDescription(Season season) {
        return switch (season) {
            case WINTER -> "Der Winter ist kalt und es schneit.";
            case FRUEHLING -> "Im Frühling wird es wärmer und Blumen blühen.";
            case SOMMER -> "Der Sommer ist heiß und perfekt zum Entspannen.";
            case HERBST -> "Im Herbst fallen die Blätter von den Bäumen.";
        };
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + ": " + getDescription(season));
        }
    }
}