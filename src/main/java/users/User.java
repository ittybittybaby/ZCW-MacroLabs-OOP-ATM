package users;

import accounts.Account;
import java.util.ArrayList;


public class User {

    private long userId;
    private String name;
    private String password;
    private ArrayList accounts = new ArrayList();
    private ArrayList transactions = new ArrayList();

    public User() {}

    protected void setUserName(String name) {this.name = name;}

    protected void setPassword(String password) {this.password = password;}

    protected void setUserId(long userId) {this.userId = userId;}

    protected String getUserName() {return this.name;}

    protected String getPassword() {return this.password;}

    protected long getUserId() {return this.userId;};

    protected void addAccount(Account account) {
        accounts.add(account);
    }

    protected void deleteAccount(Account account) {
        if(account.checkBalance() == 0) {
            accounts.remove(account);
        }
        else {
            System.out.println("** Can not delete account - Balance must be zero **");
        }
    }

    public void depositFunds(double money, Account accountTo) {
        String transactionType = "Deposit";
        accountTo.modifyBalance(money);
        Transaction transaction = new Transaction(money, accountTo, transactionType);
        transactions.add(transaction);
    }

    public void withdrawFunds(double money, Account accountFrom) {
        String transactionType = "Withdraw";
        if(accountFrom.checkBalance() - money <= 0) {
            System.out.println("** Insufficient Funds **");
        }
        else {
            money = 0 - money;
            accountFrom.modifyBalance(money);
            Transaction transaction = new Transaction(money, accountFrom, transactionType);
            transactions.add(transaction);
        }
    }

    public void transferFunds(double money, Account accountFrom, Account accountTo) {
        if(accountFrom.checkBalance() - money > 0) {
            this.withdrawFunds(money, accountFrom);
            this.depositFunds(money, accountTo);
            Transaction transaction = new Transaction(money, accountFrom, accountTo);
            transactions.add(transaction);
        }
        else {
            System.out.println("** Unable to process transaction **");
        }
    }

    public void sendFunds(double money, User sender, Account sendAccount, User receiver, Account receiveAccount) {
        if(sendAccount.checkBalance() - money >= 0) {

        }
    }

    public ArrayList getAllTransactions() {
        return this.transactions;
    }

    protected int getNumberOfAccounts() {
        return accounts.size();
    }

}