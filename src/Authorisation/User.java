package Authorisation;

public class User {
    private UserInfo userInfo;
    private UserCredentials userCredentials;

    public User(UserCredentials userCredentials, UserInfo userInfo) {
        this.userCredentials = userCredentials;
        this.userInfo = userInfo;
    }

    public void getInfo() {
        userInfo.getInfo();
    }

    public void changeCredentials(String login, String password) {
        userCredentials.setCredentials(login, password);
        System.out.println("login and password changed");
    }

    public void changeLogin(String login) {
        userCredentials.setLogin(login);
        System.out.println("login changed");
    }

    public void changePassword(String password) {
        userCredentials.setPassword(password);
        System.out.println("password changed");
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }
}
