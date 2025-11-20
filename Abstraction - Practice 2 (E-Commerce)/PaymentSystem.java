abstract class PaymentSystem {
    
    protected double dblAmount;
    protected String strTransactionID;

    PaymentSystem(double amount, String transactID)                 
    {
        this.dblAmount = amount;
        this.strTransactionID = transactID;
    }

    /*
       Abstract Methods:
       processPayment() -> returns bool
       getPaymentType() -> "Credit Card", or "E-Payment"
    */

    public abstract boolean funcIsProcessPayment(String inputAccountNum, String inputCredential);
    public abstract double funcTransaction(double dblTransactAmount, String inputAccountNum, String inputCredential);
    public abstract String funcGetPaymentType();

    /*
       Concrete Methods:
       printReceipt() -> prints info
       funcRefund(double refundAmount) -> refund function
    */
    
    public String funcPrintInfo() 
    {
        return "===TRANSACTION MADE===" +
                "\nTransaction Process: " + funcGetPaymentType() +
                "\nTransaction Mode: " + funcGetPaymentType() +
                "\nTransaction ID: " + this.strTransactionID +
                "\nAmount: " + this.dblAmount;
    }

    public double funcRefund(double dblRefundAmount, String inputAccountNum, String inputCredential)
    {
        if (!funcIsProcessPayment(inputAccountNum, inputCredential)) {
            this.dblAmount += dblRefundAmount;
            return this.dblAmount;
        }

        return this.dblAmount;
    }

    
}
