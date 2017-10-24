package users;

import java.util.ArrayList;

public class UserWarehouse {

    public ArrayList users = new ArrayList();

    protected void addUser(User user) {
        users.add(user);
        user.setUserId(users.indexOf(user));
    }

    protected void removeUser(User user) {
        users.remove(user);
    }

}
