package users;

import java.util.ArrayList;

public class UserWarehouse {

    static ArrayList users = new ArrayList();

    public UserWarehouse() {}

    public void addUser(User user) {
        users.add(user);
        user.setUserId(users.indexOf(user));
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public int getTotalUsersNumber() {
        return users.size();

    }

}
