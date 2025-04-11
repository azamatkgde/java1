package basics.erlan;

public class Transfer {
    private Player player;
    private double price;

    public Transfer(Player player, double price) {
        this.player = player;
        this.price = price;
    }

    public Player getPlayer() { return player; }
    public double getPrice() { return price; }
}