package users;

public class UserFactory {

    public User createUser(long userId, String password) {

        User user = new User();
        user.setPassword(password);
        return user;

        /* // Move logic to try catch in main
        if(username != null && username != "" &&
                password != null && password != "") {
            User user = new User();
        }
        */

    }
}
