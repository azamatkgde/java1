package interfaces.aibek.messenger;

public class Whatsapp  implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Whatsapp ка билдируу жонотулду");
    }

    @Override
    public void getMessage() {
        System.out.println("Whatsapp ка билдируу келди");
    }
}
