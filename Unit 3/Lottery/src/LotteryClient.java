public class LotteryClient {
   //main method
   public static void main(String[] args){
      //Create the customer's lotto ticket. These numbers should be chosen by the customer and hard coded in.
      Lottery ticket = new Lottery(6, 78, 34, 56, 24, 33);
      //Create the random winning pick!
      Lottery winningCombo = new Lottery();
      //Print out the customer's ticket and the winning pick, clearly stating which is which.
      System.out.println("Your Ticket: " + ticket.getLottoNumbers() + "\nWinning Pick: " + );
      //Check if the customer won!
      ticket.checkTicket(winningCombo);
   }
}