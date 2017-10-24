public class SavingsAccount extends Account {

    {
        interest = 2.00;
        balance = 0.0;
        //accountNumber = generateAccountNumber();
    }

    /*
    private static long generateAccountNumber() {
        //long number = (long)(Math.random() * )
    }
    */

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void modifyBalance(double money) {
        balance += money;
    }


}
