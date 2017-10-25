package users;

import java.util.ArrayList;

public class UserWarehouse {

    static ArrayList<User> users = new ArrayList();

    public UserWarehouse() {}

    public void addUser(User user) {
        users.add(user);
        user.setUserId(users.size());
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public int getTotalUsersNumber() {
        return users.size();
    }

    public User findUser(long userId, String password) {
        User match = null;
        for(User user : users) {
            if(userId == user.getUserId() && user.getPassword().equals(password)) {
                match = user;
            }
        }
        return match;
    };

    public User getUserAtIndex(int i) {
        return users.get(i);
    }

}
