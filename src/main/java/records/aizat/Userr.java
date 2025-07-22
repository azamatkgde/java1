package records.aizat;

public record Userr(String username, String password){
    public Userr {
        if (password.length() < 6) {
            throw new IllegalArgumentException("Пароль должен быть не меньше 6 символов");
        }
    }

}

