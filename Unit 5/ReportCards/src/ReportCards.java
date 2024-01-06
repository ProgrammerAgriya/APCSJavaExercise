import java.util.Scanner;
public class ReportCards {
  //instance variables/attributes
    private double gpa;
    private boolean hasF = false;
    private int numClasses;

    public ReportCards()
    {
        Scanner in = new Scanner(System.in);
        //Ask the user to input the first grade. Be sure to let them know what the valid grades are.
        /*ToDo*/
        //Save the grade as a String
        /*ToDo*/
        //Enter an if-statement to test if the grade entered is not valid.
        /*ToDo*/
        {
            System.out.println("You did not enter a valid grade. Please rerun the program.");
            System.exit(1);
        }
        //Use a loop to initialize or update numClasses, gpa, and hasF. The loop should run until the user inputs anything other than a valid grade.
        /*ToDo*/
        //Finish calculating gpa.
        /*ToDo*/
    }

    //Calculate gpa, change hasF to true if an F is entered, and initialize numClasses to however many classes are entered.
    public ReportCards(char g1, char g2, char g3, char g4, char g5)
    {
        /*ToDo*/

    }

    //getter methods
    //Code all of the getter methods
    /*ToDo*/

    /*This method should return a String that follows the given table - any different formatting will cause the Check
     button to print Incorrect. Be aware that number of classes supersedes any of the other eligibility requirements.*/
    public String eligibility()
    {
        /*ToDo*/
    }
}