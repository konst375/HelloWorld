package Authorisation;

public class UserUI {
    public User signIn(UserCredentials userCredentials) {
        for (int i = 0; i < UserDB.getCurrentSize(); i++) {
            if (CredentialsValidator.isCredentialsValid(userCredentials)) {
                if (UserDB.get(i).getUserCredentials().getLogin().equals(userCredentials.getLogin())
                        && UserDB.get(i).getUserCredentials().getPassword().equals(userCredentials.getPassword())) {
                    System.out.println("logIn successful");
                    return UserDB.get(i);
                }
            } else {
                System.out.println("unsuccessful logIn");
                return null;
            }
        }
        return null;
    }

    public void signUp(UserCredentials userCredentials, UserInfo userInfo) {
        if (CredentialsValidator.isCredentialsValid(userCredentials)) {
            UserDB.add(UserFactory.createUser(userCredentials, userInfo));
            System.out.println("registration successful");
        } else {
            System.out.println("unsuccessful registration");
        }
    }
}
