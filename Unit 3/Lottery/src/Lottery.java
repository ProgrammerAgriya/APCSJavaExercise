public class Lottery {
    //instance variables
    private String lottoNumbers;

    //constructors
    /*No parameter constructor. Initialize the lottoNumbers randomly. Numbers can be chosen more than once.*/
    public Lottery()
    {
        lottoNumbers = "";
        int num1 = (int)(Math.random()*100)+1;
        lottoNumbers += num1 + " ";
        int num2 = (int)(Math.random()*100)+1;
        lottoNumbers += num2 + " ";
        int num3 = (int)(Math.random()*100)+1;
        lottoNumbers += num3 + " ";
        int num4 = (int)(Math.random()*100)+1;
        lottoNumbers += num4 + " ";
        int num5 = (int)(Math.random()*100)+1;
        lottoNumbers += num5 + " ";
        int num6 = (int)(Math.random()*100)+1;
        lottoNumbers += num6;
    }
    //Constructor with parameters. Initialize customers' lotto ticket according to the numbers they choose.
    public Lottery(int num1, int num2, int num3, int num4, int num5, int num6)
    {
        lottoNumbers = num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6;
    }

    //getter method
    //Create the getter method to make sure lottoNumbers is accessible outside of the Lottery class.
    public String getLottoNumbers()
    {
        return lottoNumbers;
    }

    //mutator methods
    /*Check to see if two Lottery objects are the equal. The method should take a Lottery object in as a parameter
    and should return true if the two lotto numbers match, false if they do not.*/
    public boolean equals(Lottery other)
    {
        return (this.lottoNumbers).equals(other.lottoNumbers);
    }

    /*Print the whether or not the customer's ticket is a winner. The method should take a Lottery object in as a parameter.
    * You should use the equals method you just wrote in this method.*/
    public void checkTicket(Lottery other)
    {
        if(this.equals(other))
            System.out.println("You won the lottery!!");
        else
            System.out.println("You lost. Try again next week!");
    }
}
