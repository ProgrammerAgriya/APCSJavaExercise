import java.util.Scanner;
public class GoalKeeper {

    private int[] goalsAgainst;
    private int[] saves;
    private String name;
    Scanner in = new Scanner(System.in);

    public GoalKeeper()
    {
        /*ToDo*/
    }

    public GoalKeeper(String name, int[] goalsAgainst, int[] saves)
    {
        this.name = name;
        this.goalsAgainst = goalsAgainst;
        this.saves = saves;
    }

    //Write the getName() method
    /*ToDo*/

    //Calculates the goal keeper's overall save percentage.
    public double savePercentage()
    {
        /*ToDo*/
    }
}