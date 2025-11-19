class EPayment extends PaymentSystem {

    /*
    Additional Properties

    String mobileNumber
    String otpNumber

    Overrides

    processPayment(): simulate OTP sending + verification 

    
    */

    @Override
    public boolean funcIsProcessPayment() {
        return true;
    }
    



    @Override
    public String funcGetPaymentType() 
    {
        return "E-Payment";
    }
}
