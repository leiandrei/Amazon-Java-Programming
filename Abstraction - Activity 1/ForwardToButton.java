class ForwardToButton extends AbstractButtonClass implements ButtonPress {

    private String strForwardTo;
    private String strForwardMessage;

    @Override
    public void buttonPress() {
        System.out.println("Forward To: " + this.strForwardTo);
        System.out.println("Message: " + this.strForwardMessage);
    }

    public void buttonHover() {
        
    }

    public void setStrForwardTo(String strForwardTo) {
        this.strForwardTo = strForwardTo;
    }

    public void setStrForwardMessage(String strForwardMessage) {
        this.strForwardMessage = strForwardMessage;
    }

    
}
