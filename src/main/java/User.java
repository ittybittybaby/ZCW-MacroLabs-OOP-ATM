import java.util.ArrayList;

public class User {

    private long userId;
    private String password;
    private ArrayList accounts = new ArrayList();

    public User() {

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }


    public void depositFunds(double money, Account accountIn) {
        accountIn.modifyBalance(money);
    }

    public void withdrawFunds(double money, Account accountOut) {
        if(accountOut.checkBalance() - money <= 0) {
            System.out.println("** Insufficient Funds **");
        }
        else {
            accountOut.modifyBalance(-money);
        }
    }

    public void transferFunds(double money, Account accountOut, Account accountIn) {
        if(accountOut.checkBalance() - money > 0) {
            this.withdrawFunds(money, accountOut);
            this.depositFunds(money, accountIn);
        }
        else {
            System.out.println("** Unable to process transaction **");
        }
    }



}