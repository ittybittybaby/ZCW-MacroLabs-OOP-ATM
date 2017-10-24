package accounts;

public abstract class Account {

    private static long UIDCounter = 0;
    protected double interest;
    protected double balance;
    protected String accountNumber;

    //abstract void createAccount();

    abstract public double checkBalance();

    abstract public void modifyBalance(double money);

}