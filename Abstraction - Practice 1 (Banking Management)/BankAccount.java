abstract class BankAccount {

    protected String strAccountNumber;
    protected String strOwnerName;
    protected double dblBalance;

    // Constructor
    BankAccount(String accNum, String name, double balance) {
        this.strAccountNumber = accNum;
        this.strOwnerName = name;
        this.dblBalance = balance;
    }

    // Abstract Methods
    public abstract double funcCalculateInterest();
    public abstract String funcGetAccountType();

    // Concrete Methods
    public double funcDepositMoney(double dblAmount) {

        if (dblAmount <= 0) {
            System.out.println("Enter valid amount!");
            return this.dblBalance;
        }

        this.dblBalance += dblAmount;
        return this.dblBalance;
    }

    public double funcWithdrawMoney(double dblAmount) {

        if (dblAmount <= 0) {
            System.out.println("Enter valid amount!");
            return this.dblBalance;
        }

        if (dblAmount > this.dblBalance) {
            System.out.println("Insufficient funds!");
            return this.dblBalance;
        }

        this.dblBalance -= dblAmount;
        return this.dblBalance;
    }

    public String funcDisplayInfo() {
        return "===Account Info===" +
                "\nAccount Type: " + funcGetAccountType() +
                "\nAccount Owner: " + this.strOwnerName +
                "\nAccount Number: " + this.strAccountNumber +
                "\nAccount Balance: " + this.dblBalance;
    }



}