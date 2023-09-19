package Lat1;

public class Student
{
    public String name, studentID;
    public float subject1, subject2, subject3, subject4;

    public void grade()
    {
        System.out.println("Grade of " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("----------------------------");
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Subject 4: " + subject4);
    }
}
