 package methods.meerim;
public class Metodi {
    public static void main(String[] args) {
        int x = Utility.chiediInt("Vvedi X");
        int y = Utility.chiediInt("Vvedi Y");

        int maxValue = max(x, y);
        System.out.println("Returned Max: " + maxValue);



        System.out.println("----------------------------");
        String name =  Utility.chiediString("Name:");
        greetUser(name);

    }
    public static int max(int x, int y) {
        int n;
        if (x > y){
            n = x;
        } else {
            n = y;
        }
        System.out.println("Max: " + n);
        return n;
    }

    public static void greetUser(String name) {
            System.out.println( "Salam, " + name + "!");

        }

}

