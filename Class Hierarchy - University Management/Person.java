abstract class Person {

    protected String strName;
    protected Date dtDateOfBirth;

    Person(String name, Date dob) {
        this.strName = name;
        this.dtDateOfBirth = dob;
    }

    public abstract String getDetails();
    
}
