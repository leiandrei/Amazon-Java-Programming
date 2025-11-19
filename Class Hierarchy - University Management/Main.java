import java.util.*;

public class Main {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        // Instantiation of Date objects
        Date objDoBStudent = new Date(25, 6, 2005); // student date of birth
        Date objDoBTeacher = new Date(12, 4, 2006); // teacher date of birth
        Date objDateofAppointment = new Date(30, 4, 2024); // date of appointment

        Teachers objMathTeacher = new Teachers("Alaine Lladones", objDoBTeacher, "01T-0001", 
            objDateofAppointment, 50000, "Mathematics", "Discrete Mathematics");

        System.out.print("Set salary increment for the teacher: ");
        int increment = scan.nextInt();

        objMathTeacher.setSalary(increment);

        System.out.println(objMathTeacher.getDetails());

        System.out.println();

        Student objNewStudent = new Student("Lei Andrei", objDoBStudent, "01S-0001",
            "Computer Science", "Freshman", objMathTeacher);

        System.out.println(objNewStudent.getDetails());
        
        
        scan.close();
    }
    
}
