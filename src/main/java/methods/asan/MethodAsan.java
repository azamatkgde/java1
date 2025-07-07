package methods.asan;

public class MethodAsan {
    public static void main(String[] args){
        greetUser("Асан");
        int result = max(10,15);
        System.out.println("Максималдуу" + result);

    }
     public static void greetUser(String name){
        System.out.println(" Салам " + name);
    }
    public static int max(int a, int b){
        int max;       ;
        if (a>b){
           max = a;
        }else {
            max=b;
        }
        return max;
    }
}
