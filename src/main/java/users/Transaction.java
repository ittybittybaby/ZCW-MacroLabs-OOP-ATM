package users;

import accounts.Account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private long dateTime;
    //private long transactionId;
    private String transactionType;
    private String outLog = "";

    public Transaction(double money, Account account, String transactionType) {
        this.dateTime = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd,yyyy HH:mm");
        Date formattedDate = new Date(dateTime);

        outLog +=  formattedDate + " >> " + transactionType + " $" + money +
                (transactionType.equals("deposit") ? " to " : " from ") + account.toString() + ":" + account.getAccountId();
    }

    public Transaction(double money, Account accountFrom, Account accountTo) {
        this.dateTime = System.currentTimeMillis();
        this.transactionType = "Transfer";
        outLog +=  dateTime + " >> " + transactionType + " $" + money + " from " + accountFrom + "-" + accountFrom.getAccountId() +
                " to " + accountTo + "-" + accountTo.getAccountId();
    }

    protected String getRecord() {
        return this.outLog;
    }



}
