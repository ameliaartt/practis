package practice4.z3;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() { return login; }

    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}
