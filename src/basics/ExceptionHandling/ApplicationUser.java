package basics.ExceptionHandling;

public class ApplicationUser {
    public static void main(String[] args) {
        User user = new User("Oleg", "Nicheporenko", "Barcelona");
        CredentialsView credentialsView = new CredentialsView(null, null, user);
        credentialsView.validateCredentials("Oleg", "Oleg", "Oleg");
        credentialsView.validateCredentials("dlkgmv", "dlkgmv", "dlkgmv");
    }
}
