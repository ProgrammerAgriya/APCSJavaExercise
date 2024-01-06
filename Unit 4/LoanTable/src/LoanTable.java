public class LoanTable {
   //instance variables (attributes)
   private String item;
   private double principal;
   private double lowRate;
   private double highRate;
   private double increment;
   private int years;

   //constructors
   public LoanTable()
   {
      System.out.print("You have not included enough information. Please rerun the program with more information.");
      System.exit(1);
   }

   public LoanTable(String myItem, double myPrincipal, double myLowRate, double myHighRate, double myIncrement, int myYears)
   {
      item = myItem;
      principal = myPrincipal;
      lowRate = myLowRate;
      highRate = myHighRate;
      increment = myIncrement;
      years = myYears;
   }

   public void printTable() {
      //Print out the title of the table with the name of the item the user is taking a loan on
      System.out.println("Monthly Payment Analysis for a(n) " + /*ToDo*/);
      System.out.println("Annual Interest Rate          Monthly Payment");
      //Create a for-loop to make the table. For this assignment, you will not need a nested for loop.
      for(/*ToDo*/){
         //Makes the rate into its correct decimal value for calculations
         i /= 100;
         //Calculate the monthly payment using the given formula
        double mp = /*ToDo*/;
        /*print out the current interest rate (it is multiplied by 100 to make it easier for the user to read
         * Do not delete the spaces!*/
        System.out.println((/*ToDo*/*100) + "                          " + mp);
        //Sets the rate back so the loop will correctly increment
        i*=100;
      }
   }
}