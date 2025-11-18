/*
    Abstract Class -> can't be instantiated

    Abstract Method:
    - must be overridden
    - does not have a method body
 */



abstract class AbstractButtonClass {
    
    private String caption;

    public abstract void buttonPress(); // Abstract Method


    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption(String caption) {
        return this.caption;
    }


}
