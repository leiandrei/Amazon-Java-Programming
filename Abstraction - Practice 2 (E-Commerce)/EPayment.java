class EPayment extends PaymentSystem {

    private String strMobileNumber;
    private String strOTPNumber;

    EPayment(String mobileNum, String otpNum, double amount, String transactID) 
    {
        super(amount, transactID);
        this.strMobileNumber = mobileNum;
        this.strOTPNumber = otpNum;
    }


    @Override
    public boolean funcIsProcessPayment(String inputAccountNum, String inputCredential) {

        if (!this.strMobileNumber.equals(inputAccountNum))
        {
            System.out.println("Mobile Number does not match!");
            return false;
        }

        if (!this.strOTPNumber.equals(inputCredential)) {
            System.out.println("OTP Number does not match!");
            return false;
        }

        System.out.println("===Payment Transaction Success!===");
        return true;
    }

    @Override
    public String funcPrintInfo() 
    {
        return "===TRANSACTION MADE===" +
                "\nTransaction Process: " + funcIsProcessPayment(strMobileNumber, strOTPNumber) +
                "\nTransaction Mode: " + funcGetPaymentType() +
                "\nTransaction ID: " + this.strTransactionID +
                "\nAmount: " + this.dblAmount;
    }
    

    @Override
    public String funcGetPaymentType() 
    {
        return "E-Payment";
    }


    @Override
    public double funcTransaction(double dblTransactAmount)
    {
        /*
            Existing line of code. 
        */

        return dblTransactAmount;
    }
}
