package interfaces.yryskeldi.example2;

interface AuthService {
    boolean login(String username, String password);
}

class SimpleAuth implements AuthService {
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("12345");
    }
}
