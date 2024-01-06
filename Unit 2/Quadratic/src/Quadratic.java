import static java.lang.Math.sqrt;
public class Quadratic {
    //instance variables
    private double a;
    private double b;
    private double c;

    //constructor
    public Quadratic(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //mutator method
    public String findRoots()
    {
        double discrimnant = sqrt(b * b - 4 * a * c);
        double root = -b + discrimnant;
        double root1 = root/(2*a);
        root = -b - discrimnant;
        double root2 = root/(2*a);
        //Do not alter the code below in any way.
        String message = "The roots for a quadratic with coefficients a = " + a + " b = " + b + " and c = " + c;
        message += " are " + root1 + " and " + root2 + ".";
        return message;
    }
}
