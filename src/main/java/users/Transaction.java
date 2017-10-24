package users;

import accounts.Account;

public class Transaction {

    private long dateTime;
    private long transactionId;
    private String transactionType;
    private String outLog = "";

    public Transaction(double money, Account account, String transactionType) {
        this.dateTime = System.currentTimeMillis();
        outLog +=  dateTime + " >> " + transactionType + " $" + money + (transactionType.equals("deposit") ? " to " : " from ") + account;
    }

    public Transaction(double money, Account accountFrom, Account accountTo) {
        this.dateTime = System.currentTimeMillis();
        this.transactionType = "Transfer";
        outLog +=  dateTime + " >> " + transactionType + " $" + money + " from " + accountFrom + " to " + accountTo;
    }

    private String getRecord() {
        return this.outLog;
    }

}
