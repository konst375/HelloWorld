package Authorisation;

import java.util.UUID;

public class Application {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        userUI.signUp(new UserCredentials("kostya", "123456"),
                new UserInfo("Konstantin", "Chyrko", "21")
        );
        userUI.signUp(new UserCredentials("denis", "123456"),
                new UserInfo("Denis", "Turbal", "21")
        );
        userUI.signIn(new UserCredentials("kostya", "123456")).getInfo();
        userUI.signIn(new UserCredentials("denis", "123456")).changeCredentials("Denis", "654321");
        userUI.signIn(new UserCredentials("denis", "654321")).getInfo();
    }
}
