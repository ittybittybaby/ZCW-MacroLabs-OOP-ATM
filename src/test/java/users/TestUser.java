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

    // == User variable interactions ==

    @Test
    public void testSetUserName() {
        user.setUserName("Test");

        String expected = "Test";

        String actual = user.getUserName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetUserName() {
        user.setUserName("Test");

        String expected = "Test";

        String actual = user.getUserName();
    }

    @Test
    public void testSetUserPassword() {
        user.setPassword("1234");

        String expected = "1234";

        String actual = user.getPassword();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetUserPassword() {
        user.setPassword("123");

        String expected = "123";

        String actual = user.getPassword();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetUserId() {
        user.setUserId(1);

        long expected = 1;

        long actual = user.getUserId();

        Assert.assertEquals(expected, actual);
    }

    // == Account Actions (Add, Remove) ==

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

    @Test
    public void testGetNumberOfAccounts() {
        user.addAccount(checking);
        user.addAccount(savings);

        int expected = 2;

        int actual = user.getNumberOfAccounts();

        Assert.assertEquals(expected, actual);
    }

    // == User Actions On Account (Deposit, Withdraw, Transfer) ==

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
