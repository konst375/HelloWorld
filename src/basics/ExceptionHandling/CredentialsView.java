package basics.ExceptionHandling;

public class CredentialsView {
    String login;
    String password;
    User user;

    public CredentialsView(String login, String password, User user) {
        this.login = login;
        this.password = password;
        this.user = user;
    }

    public void validateCredentials(String login, String password, String confirmPassword) {
        if (!login.equals(this.login)) {
            if (CredentialsValidator.isLoginValid(login)) {
                this.login = login;
            }
        }
        if (!password.equals(this.password)) {
            if (CredentialsValidator.isPasswordValid(password, confirmPassword)) {
                this.password = password;
            }
        }
        if (this.login != null && this.password != null) {
            System.out.println("Authentication successful "+ login);
        }
    }
}
