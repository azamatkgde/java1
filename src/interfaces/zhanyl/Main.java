package interfaces.zhanyl;

public class Main {
    public static void main(String[] args) {
        Blender blender = new Blender();
        Microwave microwave = new Microwave();
        Toaster toaster = new Toaster();

        blender.start();
        microwave.start();
        toaster.start();
    }
}

