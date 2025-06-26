package abstractclass.erlan;

public abstract class FootballClub {
    protected String name;
    protected int foundedYear;

    public FootballClub(String name, int foundedYear) {
        this.name = name;
        this.foundedYear = foundedYear;
    }

    public void showInfo() {
        System.out.println("Клуб: " + name + ", Год основания: " + foundedYear);
    }

    public void playMatch() {
        System.out.println(name + " играет в чемпионате Испании (La liga)");
    }

    public abstract void chant();  // Ар бир клубдун өз урааны болот
}
