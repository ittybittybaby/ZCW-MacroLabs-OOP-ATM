package accounts;

public abstract class Account {

    protected double interest;
    protected double balance;

    abstract public double checkBalance();

    abstract public void modifyBalance(double money);

}