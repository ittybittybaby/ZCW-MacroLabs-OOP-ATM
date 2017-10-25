package users;

import org.junit.Assert;
import org.junit.Test;

public class TestUserFactory {

    UserFactory factory = new UserFactory();

    @Test
    public void testGenerateUser() {
        User someUser = null;
        someUser = factory.generateUser("Test", "1234");

        Assert.assertNotNull(someUser);
    }
}
