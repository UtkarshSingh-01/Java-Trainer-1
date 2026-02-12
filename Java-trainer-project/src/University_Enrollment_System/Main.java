package University_Enrollment_System;

public class Main {
    public static void main(String[] args){
        Professor proAbhishek = new Professor("Abhishek","abhishek@gmail.com","ComputerScience");
        Student s1=new Student("Utkarsh","utkarsh@gmail.com",9.1);
        Student s2=new Student("Aman","aman@gmail.com",9.0);
        Student s3=new Student("Sneha","sneha@gmail.com",9.5);
        Student s4=new Student("Isha","isha@gmail.com",9.52);
        Student s5=new Student("Aditya","atitya@gmail.com",8.5);

        System.out.println("1. Individual data: ");
        System.out.println("Professor: "+proAbhishek.getName()+"["+proAbhishek.getEmail()+"]");

        System.out.println("Student 1: "+s1.toString());
        System.out.println("Student 2: "+s2.toString());
        System.out.println("Student 3: "+s3.toString());
        System.out.println("Student 4: "+s4.toString());
        System.out.println("Student 5: "+s5.toString());
        System.out.println("=============================\n");

        Course javaCourse=new Course("Java OOPS","JV007",proAbhishek,6);

        try{
            System.out.println(" Enrollment Process");
            javaCourse.enrolledStudent(s1);
            javaCourse.enrolledStudent(s2);
            javaCourse.enrolledStudent(s3);
            System.out.println("Attempting to enroll another student: ");
            javaCourse.enrolledStudent(s4);
            javaCourse.enrolledStudent(s5);
        }catch(EnrollmentException e){
            System.err.println("Error: "+e.getMessage());
        }finally {
            javaCourse.displayDetails();
        }

    }
}
