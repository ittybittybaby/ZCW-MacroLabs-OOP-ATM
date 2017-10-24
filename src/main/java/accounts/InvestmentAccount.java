package accounts;

public class InvestmentAccount extends Account {

    {
        interest = 4.0;
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
