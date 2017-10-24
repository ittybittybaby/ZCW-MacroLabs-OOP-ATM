package accounts;

public class CheckingAccount extends Account {

    {
        interest = 0.5;
        balance = 0d;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void modifyBalance(double money) {
        balance += money;
    }

}
