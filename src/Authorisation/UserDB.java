package Authorisation;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static final List<User> users = new ArrayList<>();

    public static boolean add(User user) {
        return users.add(user);
    }

    public static User get(int index) {
        return users.get(index);
    }

    public static int getCurrentSize() {
        return users.size();
    }
}
