class Student extends Person {

    private String strStudentID;
    private String strCourseEnrolled;
    private String strYearOfStudy;
    private Teachers objProfessor;


    Student(String name, Date dob, String studentID, String courseEnrolled, String yearOfStudy, Teachers professor) {
        super(name, dob);
        this.strStudentID = studentID;
        this.strCourseEnrolled = courseEnrolled;
        this.strYearOfStudy = yearOfStudy;
        this.objProfessor = professor;
    }

    @Override
    public String getDetails() {
        return "===STUDENT DETAILS===" +
               "\nName: " + this.strName  +
               "\nDate of Birth: " + this.dtDateOfBirth.getDate() +
               "\nStudent ID: " + this.strStudentID +
               "\nCourse Enrolled: " + this.strCourseEnrolled +
               "\nYear of Study: " + this.strYearOfStudy +
               "\nProfessor: " + this.objProfessor.strName;
    }
    
    
}
