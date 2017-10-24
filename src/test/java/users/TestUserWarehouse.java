package users;

import org.junit.Assert;
import org.junit.Test;

public class TestUserWarehouse {

    UserWarehouse users = new UserWarehouse();
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



}
