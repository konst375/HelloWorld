package Authorisation;

public class UserFactory {
    public static User createUser(UserCredentials userCredentials, UserInfo userInfo) {
        return new User(userCredentials, userInfo);
    }
}
