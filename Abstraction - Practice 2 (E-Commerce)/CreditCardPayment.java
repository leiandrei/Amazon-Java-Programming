class CreditCardPayment extends PaymentSystem {
    
    private String strCardNumber;
    private String strCVV;

    CreditCardPayment(String tstrCredNum, String tstrCVV, double amount, String transactID)
    {
        super(amount, transactID);
        this.strCardNumber = tstrCredNum;
        this.strCVV = tstrCVV;
    }

    @Override
    public boolean funcIsProcessPayment(String inputCardNum, String inputCredential)
    {
        if (!this.strCardNumber.equals(inputCardNum)) {
            System.out.println("Card Number does not match the input!");
            return false;
        }

        if (!this.strCVV.equals(inputCredential)) {
            System.out.println("Card CVV does not match the input!");
            return false;
        }


        System.out.println("===Payment Transaction Success!===");
        return true;
    }

    @Override
    public String funcGetPaymentType() 
    {
        return "Credit Card";
    }




}
