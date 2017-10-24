public abstract class Account {

    protected double interest;
    protected double balance;
    protected long accountNumber;

    //abstract void createAccount();

    abstract double checkBalance();

    abstract void modifyBalance(double money);

}