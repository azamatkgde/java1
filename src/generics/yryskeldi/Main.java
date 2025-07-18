package generics.yryskeldi;

public class Main {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<>("ABC123", 5000);
        Account<Integer> acc2 = new Account<>(12345, 7000);

        System.out.println("Account 1 ID: " + acc1.getId() + ", Sum: " + acc1.getSum());
        System.out.println("Account 2 ID: " + acc2.getId() + ", Sum: " + acc2.getSum());
    }
}