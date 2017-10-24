package console;


public class Console {

    private static String title;
    private static String message;
    private static String options;

    {

    }

    public Console() {}

    private static void printTitleBar() {
        System.out.println("  ======= " + title + " =======  ");
        System.out.println("==========================");
    }

    private static void printMessage() {
        System.out.println("");
        System.out.println(message);
        System.out.println("");
    }

    private static void printOptions() {
        System.out.println("");
        System.out.println(options);
        System.out.println("");
    }

    private static void printPlaceholder() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


    public void showSpalshScreen() {

    }

    public static void startApplication() {
        title = "Welcome";
        message = "Please input an option and press 'Enter' to continue";
        options = "\t(1)Existing User Log In\t\t(2)Create New Account";

        printTitleBar();
        printMessage();
        printOptions();
    }

    public static void logIn() {
        title = "Log In";
        message = "Please input your User ID and press enter";

        printTitleBar();
        printMessage();
        printPlaceholder();
    }

    public static void switchUser() {
        title = "Switch Users";
        message = "Are you sure you want to switch users?";
        options = "\t(1)Yes\t\t(2)No";

        printTitleBar();
        printMessage();
        printOptions();
    }

    public static void newUser() {
        title = "Create New User";


    }

    public static void userHome() {
        title = "Main Menu";
        message = "Please select an option from below and press enter";
        options = "\t(1)Manage Funds\t\t(2)Modify Account";

        printTitleBar();
        printMessage();
        printOptions();
    }

    public static void viewTransactions() {
        title = "Transactions";

    }

    public static void manageFunds() {
        title = "Account Management";
        message = "Please select an option from below and press enter";
        options = "\t(1)Deposit\t(2)Withdraw\t(3)Transfer";

        printTitleBar();
        printMessage();
        printOptions();
    }

    public static void depositScreen() {
        title = "Deposit Funds";
    }

    public static void withdrawScreen() {
        title = "Withdraw Funds";
    }

    public static void transferScreen() {
        title = "Transfer Funds";
    }

    public static void modifyAccount() {
        title = "Modify Account";
        message = "Please select an option from below and press enter";
        options = "\t(1)Add Account\t(2)Remove Account\t(3)Change Password";

        printTitleBar();
        printMessage();
        printOptions();
    }

    public static void addAccountScreen() {

    }

    public static void removeAccountScreen() {

    }
















}
