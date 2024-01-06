import java.util.Scanner;
public class Striker {
    private int[] bigChanceAttempt;
    private int[] bigChanceMade;
    private int[] goalsAttempted;
    private int[] goalsMade;
    private String name;
    Scanner in = new Scanner(System.in);

    public Striker()
    {
        /*ToDo*/
    }

    public Striker(String name, int[] bigChanceAttempt, int[] bigChanceMade, int[]goalsAttempted, int[]goalsMade)
    {
        this.name = name;
        this.bigChanceAttempt = bigChanceAttempt;
        this.bigChanceMade = bigChanceMade;
        this.goalsAttempted = goalsAttempted;
        this.goalsMade = goalsMade;
    }

    //Write the getName() method
    /*ToDo*/

    //Calculates the overall goal percentage (goals made out of total goals).
    public double goalPercentage()
    {
        /*ToDo*/
    }

    //Calculates the overall big chances percentage (big chances completed out of total attempts).
    public double bigChancePercentage()
    {
        /*ToDo*/
    }
}
