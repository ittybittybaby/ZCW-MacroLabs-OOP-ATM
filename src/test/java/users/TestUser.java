package users;


import accounts.CheckingAccount;
import accounts.SavingsAccount;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestUser {
    User user= new User();

    SavingsAccount savings = new SavingsAccount();
    CheckingAccount checking = new CheckingAccount();

    // Account Actions (Add, Remove)
    @Test
    public void testAddAccount() {
        user.addAccount(checking);

        int expected = 1;

        int actual = user.getNumberOfAccounts();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeleteAccount() {
        user.addAccount(savings);
        user.addAccount(checking);
        user.deleteAccount(savings);

        int expected = 1;

        int actual = user.getNumberOfAccounts();

        Assert.assertEquals(expected, actual);
    }

    // User Actions On Account (Deposit, Withdraw, Transfer)

    @Test
    public void testDepositFunds() {
        user.depositFunds(9000.01, savings);

        double expected = 9000.01;

        double actual = savings.checkBalance();

        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void testWithdrawFunds_Pass() {
        user.depositFunds(999, savings);

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
