package interfaces.yryskeldi.example2;

public class Program {
    public static void main(String[] args) {
        AuthService auth = new SimpleAuth();
        if (auth.login("admin", "12345")) {
            System.out.println("Кирүү ийгиликтүү");
        } else {
            System.out.println("Кирүү ката");
        }
    }
}

