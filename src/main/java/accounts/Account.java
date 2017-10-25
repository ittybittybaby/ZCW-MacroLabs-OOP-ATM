package accounts;

public class Account {

    final long accountId;
    double interest;
    double balance;

    public Account() {
        this(System.currentTimeMillis());
    }

    public Account(double interest, double balance) {
        this(System.currentTimeMillis(), 0, 0);
    }

    public Account(long accountId) {
        this(accountId, 0, 0);
    }

    public Account(long accountId, double interest, double balance) {
        this.accountId = accountId;
        this.interest = interest;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public double checkBalance() {
        return balance;
    }

    public void modifyBalance(double money) {
        balance += money;
    };

    public long getAccountId() {
        return this.accountId;
    }

}