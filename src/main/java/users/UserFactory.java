package users;

public class UserFactory {

    public UserFactory() {}

    public User generateUser(String name, String password) {
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);
        return user;
    }

        /* // Move logic to try catch in main
        if(username != null && username != "" &&
                password != null && password != "") {
            User user = new User();
        }
        */

}
