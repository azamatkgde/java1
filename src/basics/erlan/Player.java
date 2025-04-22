package basics.erlan;

public class Player extends Person {
    private String position;
    private int goalsScored;

    public Player(String name, int age, String position, int goalsScored) {
        super(name, age);
        this.position = position;
        this.goalsScored = goalsScored;
    }

    public String getPosition() {
        return position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void showInfo() {
        System.out.println("Имя: " + getName() + ", Возраст: " + getAge()
                + ", Позиция: " + position + ", Голов: " + goalsScored);
    }
}

