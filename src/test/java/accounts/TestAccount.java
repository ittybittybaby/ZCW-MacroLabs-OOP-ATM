package accounts;

import org.junit.Assert;
import org.junit.Test;

public class TestAccount {

    Account account = new Account();

    @Test
    public void testCheckBalance() {
        account.balance = 100.0d;

        double expected = 100.0d;

        double actual = account.checkBalance();

        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void testModifyBalance() {
        account.balance = 100.0d;
        account.modifyBalance(50.0d);

        double expected = 150.0d;

        double actual = account.checkBalance();

        Assert.assertEquals(expected, actual, 0d);
    }
}
