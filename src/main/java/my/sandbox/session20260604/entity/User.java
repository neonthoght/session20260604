package my.sandbox.session20260604.entity;
import lombok.Data;

@Data
public class User {
    public String username;
    public String password;
    public int a, b;

    public User() {}

    public User(int a, int b) {
        this.a = a;
        this.b = b;
    }

        public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
