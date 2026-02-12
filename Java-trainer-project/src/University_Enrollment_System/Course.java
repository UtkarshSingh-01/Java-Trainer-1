package University_Enrollment_System;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    private Professor instructor;
    private int maxCapacity;
    private List<Student> enrolledStudents;

    public Course(String courseName,String courseCode, Professor instructor,int maxCapacity){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.instructor=instructor;
        this.maxCapacity=maxCapacity;
        this.enrolledStudents=new ArrayList<>();
    }

    public void enrolledStudent(Student s) throws EnrollmentException{
        if(enrolledStudents.size()>=maxCapacity){
            throw new EnrollmentException("Course "+courseCode+" is full.");
        }
        enrolledStudents.add(s);
        System.out.println("Enrolled: "+s.getName());
    }

    public void displayDetails(){
        System.out.println("Course Details");
        System.out.println("Course: "+courseName+"("+ courseCode+")");
        System.out.println("Instructor: ");
        if(instructor!=null) System.out.println("Instructor: "+instructor.getName());
        else System.out.println("Instructor: Coming Soon!!!");

        System.out.println("Enrolled Students: ");
        for(Student s:enrolledStudents)
            System.out.println(" - "+s.toString());
    }
}
