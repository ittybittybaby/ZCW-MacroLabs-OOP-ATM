package accounts;

import java.util.UUID;

public class InvestmentAccount extends Account {

    {
        interest = 4.0;
        balance = 0d;
        accountNumber = UUID.randomUUID().toString();
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
