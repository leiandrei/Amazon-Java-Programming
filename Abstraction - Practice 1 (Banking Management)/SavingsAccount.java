class SavingsAccount extends BankAccount {

    private double dblInterestRate;


    SavingsAccount(String accNumber, String accOwner, double balance, double interestRate) 
    {
        super(accNumber, accOwner, balance);
        this.dblInterestRate = interestRate;
    }

    @Override
    public double funcCalculateInterest() {
        return this.dblBalance * this.dblInterestRate;
    }

    @Override 
    public String funcGetAccountType() {
        return "Savings Account";
    }

    @Override
    public String funcDisplayInfo() {
        return "===Account Info===" +
                "\nAccount Type: " + funcGetAccountType() +
                "\nAccount Owner: " + this.strOwnerName +
                "\nAccount Number: " + this.strAccountNumber +
                "\nAccount Balance: " + funcCalculateInterest() + 
                "\nInterest Rate: " + this.dblInterestRate + "%";
    }

    
}
