package interfaces.aibek.messenger;

public class Telegram implements  Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Telegram bot");
    }

    @Override
    public void getMessage() {
        System.out.println("Telegram");
    }
}
