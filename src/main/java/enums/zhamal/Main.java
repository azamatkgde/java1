package enums.zhamal;

public class Main {
    public static void main(String[]args){
        Level gameLevel = Level.Easy;

        switch (gameLevel){
            case Easy:
                System.out.println(" leichte Niveau - für Anfänger");
                break;
            case Medium:
                System.out.println(" leicht schwer - für Fortgeschrittene");
                break;
            case Hard:
                System.out.println( " Schwer - für proffessionele Spieler");
                break;
        }
    }
}
