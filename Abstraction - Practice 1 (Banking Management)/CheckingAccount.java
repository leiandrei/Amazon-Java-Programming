class CheckingAccount extends BankAccount {
    
    private int intDeductionFee;

    CheckingAccount(String accNumber, String accOwner, double balance, int fee) 
    {
        super(accNumber, accOwner, balance);
        this.intDeductionFee = fee;
    }

    @Override 
    public double funcCalculateInterest() {
        return 0;
    }

    @Override
    public String funcGetAccountType() {
        return "Checking Account";
    }

    @Override
    public double funcWithdrawMoney(double dblAmount) {

        if (dblAmount <= 0) {
            System.out.println("Enter valid amount!");
            return this.dblBalance;
        }

        if (dblAmount > this.dblBalance) {
            System.out.println("Insufficient funds!");
            return this.dblBalance;
        }

        this.dblBalance -= dblAmount + this.intDeductionFee;
        return this.dblBalance;
    }

    @Override
    public String funcDisplayInfo() {
        return "===Account Info===" +
                "\nAccount Type: " + funcGetAccountType() +
                "\nAccount Owner: " + this.strOwnerName +
                "\nAccount Number: " + this.strAccountNumber +
                "\nAccount Balance: " + this.dblBalance;
    }

}
