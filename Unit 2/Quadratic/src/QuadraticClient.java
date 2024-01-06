import java.util.*;
public class QuadraticClient
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value for a: ");
        double a = in.nextDouble();
        in.nextLine();
        System.out.print("Please enter a value for b: ");
        double b = in.nextDouble();
        in.nextLine();
        System.out.print("Please enter a value for c: ");
        double c = in.nextDouble();
        in.nextLine();
        //create a Quadratic object
        Quadratic quadratic = new Quadratic(a,b,c);

        //call the findRoots method in the print statement
        quadratic.findRoots();
    }
}