package users;

import org.junit.Assert;
import org.junit.Test;

public class TestUserWarehouse {

    UserWarehouse users = new UserWarehouse();
    UserFactory factory = new UserFactory();
    User user = new User();

    @Test
    public void testAddUser() {
        users.addUser(user);
        //users.addUser(user); // Uncomment to fail

        int expected = 1;

        int actual = users.getTotalUsersNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveUser() {
        users.addUser(user);
        users.removeUser(user);

        int expected = 0;

        int actual = users.getTotalUsersNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindUser() {
        users.addUser(factory.generateUser("bob", "12345"));
        users.addUser(factory.generateUser("robert", "12345"));

        User expected = users.getUserAtIndex(0);

        User actual = users.findUser(1, "12345");

        Assert.assertEquals(expected, actual);
    }




}
