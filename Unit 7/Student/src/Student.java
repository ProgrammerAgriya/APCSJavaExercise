import java.util.*;
public class Student
{
    // Student instance variables
    Scanner in = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private int graduationYear;

    // Student constructors
    public Student()
    {
        System.out.print("Please enter the student's first name: ");
        //Hint 1
        /*ToDo*/
        System.out.print("Please enter the student's last name: ");
        //Hint 1
        /*ToDo*/
        System.out.print("Please enter the student's expected graduation year: ");
        //Hint 1
        /*ToDo*/
        in.nextLine();
        System.out.print("Please enter the students' grades with a space in between each one (no + or -): ");
        String grades = in.nextLine();
        grades.trim();
        //Hint 2
        char[] gradesList = new char[/*ToDo*/];
        //Hint 3
        /*ToDo*/
        gpa = calcGpa(gradesList);
        System.out.print("Please enter the students' ID number: ");
        //Hint 1
        idNum = /*ToDo*/
        in.nextLine();
    }

    public Student(String firstName, String lastName, int idNum, char[] grades, int graduationYear)
    {
        //Initialize the instance variables to the values in the parameters.
        /*ToDo*/
    }

    //getter methods
    /*ToDo*/

    /** Returns the value representing a student's gpa given an array of chars
     * reperesenting a student's grades, where A has a value of 4, B has a value of 3,
     * C has a value of 2, D has a value of 1, and F has a value of 0. Any other chars
     * are not valid. If any other chars are encountered, there should be a warning printed
     * and the program should exit immediately.
     * Precondition: The array grades contains only chars.
     * Postcondition: grades is unchanged.*/
    private /*ToDo*/ calcGpa(char[] grades)
    {
        /*ToDo*/
    }

    //DO NOT CHANGE THIS
    public String toString()
    {
        return "Student Name: " + firstName + " " + lastName + "\nStudent ID: " + idNum + "\nStudent GPA: " + gpa+ "\nStudent Email: " + assignEmailAddress();
    }

    /** Returns a String representing a student's email formatted as follows:
     * the first letter of the student's first name followed by the student's last name,
     * the student's expected graduation year, and @serrahs.com */
    public String assignEmailAddress()
    {
        /*ToDo*/
    }

    /** equals method
     * Returns a boolean confirming whether or not two students are the same based on
     * their names and their ID numbers.
     * Precondition: The parameter, other, is of type Student and is not null.
     * Postcondition: Both students are unchanged.*/
    /*ToDo*/

}