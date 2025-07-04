package generics.azamat;

public class MainCredit {
    public static void main(String[] args) {
        Account<Integer> account1 = new Account<>(1234, 5000);
        Account<String> account2 = new Account<>("LoginId23", 5000);

        System.out.println(account1.getId());
        System.out.println(account2.getId());
    }
}
