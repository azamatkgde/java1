package methods.aizat;

public class MethodTest {
    public static void main (String[] args){
        int result = add(15, 25);  // методду чакыруу
        System.out.println("Жыйынтык: " + result);
    }


    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
