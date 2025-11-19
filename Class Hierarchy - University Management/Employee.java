abstract class Employee extends Person {

    protected Date dtDateOfAppointment;
    protected String strEmployeeID;
    protected int intSalary;

    Employee(String name, Date dob, String employeeID, Date dtOfAppointment, int salary) {
        super(name, dob);
        this.strEmployeeID = employeeID;
        this.dtDateOfAppointment = dtOfAppointment;
        this.intSalary = salary;
    }

    public abstract void setSalary(int salaryAmnt);
    public abstract int getSalary();
   
}
