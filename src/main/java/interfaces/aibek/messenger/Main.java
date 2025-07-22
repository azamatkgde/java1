package interfaces.aibek.messenger;

public class Main {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();
        whatsapp.sendMessage();
        whatsapp.getMessage();
        Telegram telegram = new Telegram();
        telegram.sendMessage();
        telegram.getMessage();
    }

}