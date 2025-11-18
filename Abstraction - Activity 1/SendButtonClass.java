/*
    It must inherit from the Abstract Class
    and override the Abstract Method
*/

class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    
    private String strSendTo;
    private String strSendMessage;

    @Override 
    public void buttonPress() 
    {
        System.out.println("Sending: " + this.strSendMessage);
        System.out.println("To " + this.strSendTo);
    }

    public void buttonHover() {
        
    }

    public void setStrSendTo(String strSendTo) 
    {
        this.strSendTo = strSendTo;
    }

    public void setStrMessage(String strSendMessage) 
    {
        this.strSendMessage = strSendMessage;
    }




}
