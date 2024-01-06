import static java.lang.Math.pow;

public class RegularPolygon
{
    //instance variables
    private int s;
    private int n;

    //constructor
    public RegularPolygon(int s, int n)
    {
        this.s = s;
        this.n = n;
    }
    //getter methods
    public int getNumSides()
    {
        return n;
    }

    public int getSideLength()
    {
        return s;
    }
    //mutator methods
    public double interiorAngle()
    {
        return (double) ((n - 2) * 180) /n;
    }

    public double exteriorAngle()
    {
        return (double) 360 /n;
    }

    public double area()
    {
        double pow = n*pow(s, 2);
        double fourtan = 4*Math.tan(Math.PI/n);
        return pow/fourtan;
    }

    //NOTE: Do not change this code!!
    public String toString()
    {
        return "A regular polygon with " + getNumSides() + " sides of length " +
                getSideLength() + " has an interior angle measurement of " + interiorAngle() + " degrees, " +
                "an exterior angle measurement of " + exteriorAngle() + " degrees, and an area of " + area() + ".";
    }
}
