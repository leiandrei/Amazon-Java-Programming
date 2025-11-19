class Teachers extends Employee {
    
    private String strDepartment;
    private String strSubjectSpecialization;

    Teachers(String name, Date dob, String employeeID, Date dtOfAppointment, int salary,
        String department, String subjectSpecialization) 
        {
        super(name, dob, employeeID, dtOfAppointment, salary);
        this.dtDateOfBirth = dob;
        this.strDepartment = department;
        this.strSubjectSpecialization = subjectSpecialization;
    }

    @Override
    public void setSalary(int salaryAmnt) { 
        this.intSalary += salaryAmnt;
    }


    @Override
    public int getSalary()
    {
        return this.intSalary;
    }

    @Override
    public String getDetails()
    {
        return "===EMPLOYEE DETAILS===" +
                "\nName: " + this.strName +
                "\nDate of Birth: " + this.dtDateOfBirth.getDate() +
                "\nEmployee ID: " + this.strEmployeeID +
                "\nDate of Appointment: " + this.dtDateOfAppointment.getDate() +
                "\nSalary: " + this.intSalary +
                "\nDepartment: " + this.strDepartment +
                "\nSubject Specialization: " + this.strSubjectSpecialization;   

    }



    
}
