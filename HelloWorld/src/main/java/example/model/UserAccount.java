package example.model;

public class UserAccount {
    private String username;
    private String password;
    private String secretIdentity;

    public UserAccount() {
    }
    public UserAccount(String username, String password, String secretIdentity) {
        this.username = username;
        this.password = password;
        this.secretIdentity = secretIdentity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", secretIdentity='" + secretIdentity + '\'' +
                '}';
    }
}
