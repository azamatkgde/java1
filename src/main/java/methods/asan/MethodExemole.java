package methods.asan;

public class MethodExemole {
    public static void main (String[] args){
        int result = add(10, 20);  // методду чакыруу
        System.out.println("Жыйынтык: " + result);
    }


    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}


