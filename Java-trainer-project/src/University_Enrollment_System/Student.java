package University_Enrollment_System;

public class Student extends Person {
    private static int idCounter=1000;
    private String studentId;
    private double cgpa;

    public Student(String name,String email,double cgpa){
        super(name, email);
        this.cgpa=cgpa;
        this.studentId="CS-"+(++idCounter);
    }
    public String getStudentId(){
        return studentId;
    }
    @Override
    public void displayRole(){
        System.out.println("Role : Student | ID : "+studentId);
    }
    @Override
    public String toString(){
        return "Student[Name = "+ getName()+", ID = "+studentId+"]";
    }
}
