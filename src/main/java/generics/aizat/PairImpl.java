package generics.aizat;

public class PairImpl {
    public static void main(String[] args){
        Pair <Integer,String> student = new Pair<>(26, "Aliya");
        System.out.println("Student " + student.getValue());
        System.out.println("Bally " + student.getKey());

        Pair<Integer, String> city = new Pair<>(312, "Бишкек");
        System.out.println("Код: " + city.getKey() + ", Город: " + city.getValue());
    }
}
