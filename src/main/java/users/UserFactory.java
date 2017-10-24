package users;

public class UserFactory {

    public User UserFactory(long userId, String password) {

        User user = new User();

        user.setPassword(password);
        //user.setUserId();
        return user;






        /* // Move logic to try catch in main
        if(username != null && username != "" &&
                password != null && password != "") {
            User user = new User();
        }
        */
    }
}
