public class RegularPolygonTester
{
    //main method
    public static void main(String[] args)
    {
        //create a decagon with side length 4
        RegularPolygon decagon = new RegularPolygon(4, 10);
        //call methods on decagon to find the specified measurements
        double iA = decagon.interiorAngle();
        double eA = decagon.exteriorAngle();
        double area = decagon.area();
        System.out.println("A regular polygon with " + decagon.getNumSides() + " sides of length " +
                decagon.getSideLength() + " has an interior angle measurement of " + iA + " degrees, " +
                "an exterior angle measurement of " + eA + " degrees, and an area of " + area + ".");
    }
}
