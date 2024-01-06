public class Coins {
    public static String getChange(){
      int cents = 94;
      int quarters = (94/25);
      int dimes = ((94%25)/10);
      int nickels = (((94%25)%10)/5);
      int pennies = ((((94%25)%10)%5)/1);
      System.out.println(quarters);
        return(cents + " cents: Quarter(s) " + quarters + ", Dime(s) " + dimes +", Nickel(s) " + nickels +", Penny(s) " + pennies);
    }
    public static void main(String[] args)
    {
        System.out.println(Coins.getChange());
    }
}