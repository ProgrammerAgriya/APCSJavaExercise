//import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;

public class TaxPayer
{
   //instance variables
   private boolean married;
   private double taxableIncome;

   //constructors
   //This is a default constructor. It sets default values in case the user forgets to.
   public TaxPayer()
   {
      married = false;
      taxableIncome = 0;
   }
   public TaxPayer(String status, double income)
   {
      status = status.trim();
      /*If status holds "married" (in upper or lowercase), married should be set to true.
       If status holds "single" (in upper or lowercase), married should be set to false.*/
      if(status.equalsIgnoreCase("married"))
      {
         married = true;
      }
      else if(status.equalsIgnoreCase("single"))
      {
         married = false;
      }
      //If status holds anything else, the program will automatically quit.
      else
      {
         System.out.println("You did not enter a valid marital status. Please rerun the program.");
         System.exit(1);
      }
      //Set taxable income.
      taxableIncome = income;
      //If taxableIncome is less than zero, the program will automatically quit.
      if(taxableIncome < 0)
      {
         System.out.println("You did not enter a valid taxable income. Please rerun the program.");
         System.exit(1);
      }
   }


   //getter methods
   public  boolean getMaritalStatus()
   {
      return this.married;
   }

   public double getIncome()
   {
      return  this.taxableIncome;
   }


   //calculator methods

   //calculates and returns the tax on a TaxPayer with single status
   private double calcSingleTax()
   {
      if (taxableIncome <= 9875 ){
         return 0;
      } else if (taxableIncome <= 40125 ) {
         return 9875 + 12*(taxableIncome-9875)/100;
      } else if (taxableIncome <= 85525) {
         return 40125 + 22*(taxableIncome-40125)/100;
      } else if (taxableIncome <= 163300) {
         return 14605.50 + 24*(taxableIncome-85525)/100;
      } else if (taxableIncome <= 207350) {
         return 163300 + 32*(taxableIncome-163300)/100;
      } else if (taxableIncome <= 518400) {
         return 207350 + 35*(taxableIncome-207350)/100;
      }else {
         return 156235 + 37*(taxableIncome-518400)/100;
      }
   }

   //calculates and returns the tax on a TaxPayer with married status
   private double calcMarriedTax()
   {
      if (taxableIncome <= 19750 ){
         return 0;
      } else if (taxableIncome <= 80250 ) {
         return 19750 + 12*(taxableIncome-19750)/100;
      } else if (taxableIncome <= 171050) {
         return 80250 + 22*(taxableIncome-80250)/100;
      } else if (taxableIncome <= 326600) {
         return 29211 + 24*(taxableIncome-171050)/100;
      } else if (taxableIncome <= 414700) {
         return 326600 + 32*(taxableIncome-326600)/100;
      } else if (taxableIncome <= 622050) {
         return 414700 + 35*(taxableIncome-414700)/100;
      }else {
         return 622050 + 37*(taxableIncome-622050)/100;
      }
   }

   /*Uses calcSingleTax() and calcMarriedTax() to calculate
   and return the appropriate tax value
    */
   public double calcTax()
   {
      if (married) {
      return calcMarriedTax();
   } else {
         return calcSingleTax();
      }

}
}
