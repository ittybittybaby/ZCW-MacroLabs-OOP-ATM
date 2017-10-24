import org.junit.Assert;
import org.junit.Test;

public class TestUser {
    User user= new User();
    SavingsAccount savings = new SavingsAccount();

    @Test
    public void testSetPassword() {

    }

    @Test
    public void testDepositFunds() {
        user.depositFunds(9000.01, savings);

        double expected = 9000.01;

        double actual = savings.checkBalance();

        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void testWithdrawFunds_Pass() {
        savings.balance = 999.00;

        double expected = 100.00;

        user.withdrawFunds(899.00, savings);
        double actual = savings.checkBalance();

        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void testTransferFunds() {
        SavingsAccount otherSavings = new SavingsAccount();

        user.depositFunds(100, savings);
        user.transferFunds(50, savings, otherSavings);

        Assert.assertTrue(savings.checkBalance() == otherSavings.checkBalance());
    }
}
