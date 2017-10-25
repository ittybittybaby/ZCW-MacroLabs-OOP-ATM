package accounts;

public class Account {

    double interest;
    double balance;

    public Account() {
        //this.interest = interest;
        //this.balance = balance;
    }


    public double checkBalance() {
        return balance;
    }

    public void modifyBalance(double money) {
        balance += money;
    };

}