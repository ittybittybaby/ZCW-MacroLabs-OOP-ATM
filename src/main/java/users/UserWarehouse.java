package users;

import java.util.ArrayList;

public class UserWarehouse {

    static ArrayList<User> users = new ArrayList();

    public UserWarehouse() {}

    public void addUser(User user) {
        users.add(user);
        user.setUserId(users.size());
        /* // Leading zeroes get deleted on conversion from string to numeric.
        String formatter = Integer.toString(users.size());
        user.setUserId( (String.format("%08d", formatter)) );
        */
    }

    public void removeUser(User user) {
        users.remove(user);
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

    public int countUsers() {
        return users.size();
    }

    public User getUserAtIndex(int i) {
        return users.get(i);
    }

    public boolean isInWarehouse(User user) {
        return users.contains(user);
    }

}
