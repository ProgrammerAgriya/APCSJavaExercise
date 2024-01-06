import java.util.Scanner;
public class Midfielder {

    private int[] interceptions;
    private int[] ballRecoveries;
    private String name;
    Scanner in = new Scanner(System.in);

    public Midfielder()
    {
        /*ToDo*/
    }

    public Midfielder(String name, int[] interceptions, int[] ballRecoveries)
    {
        this.name = name;
        this.interceptions = interceptions;
        this.ballRecoveries = ballRecoveries;
    }

    //Write the getName() method
    /*ToDo*/

    //Calculates the average interceptions per game.
    public double averageInterceptions()
    {
        /*ToDo*/
    }

    //Calculates the average ball recoveries per game.
    public double averageBallRecoveries()
    {
        /*ToDo*/
    }
}