public class TaxPayerClient {
    public static void main(String[] args)
    {
        //Create person1, an object of the TaxPayer class, with a status of single and an income of 100000.
        TaxPayer person1 = new TaxPayer("single", 100000);
        //Fill in the print statement with the appropriate method calls to print out the information stated.
        System.out.println("Marital Status: " +
                person1.getMaritalStatus() + "\nIncome: " + person1.getIncome() +
                "\nTaxes: " + person1.calcTax());
        System.out.println();
        //Create person2, an object of the TaxPayer class, with a status of married and an income of 200000.
        TaxPayer person2 = new TaxPayer("married",200000 );
        //Fill in the print statement with the appropriate method calls to print out the information stated.
        System.out.println("Marital Status: " +
                person2.getMaritalStatus() + "\nIncome: " + person2.getIncome() +
                "\nTaxes: " + person2.calcTax());
    }
}
