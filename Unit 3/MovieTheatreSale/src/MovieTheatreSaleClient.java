import java.util.Objects;

public class MovieTheatreSaleClient {
    public static void main(String[] args)
    {
        /*Create a MovieTheatreSale object called sale here using the no-parameter constructor.*/
        MovieTheatreSale sale = new MovieTheatreSale();
        /*Check if the rating is R or r here. If so, you will need to check the customer's ID.*/
        if(sale.getRating() == "R")
        {
            /*Use checkID here. If the person is too young, the output window should display this and the
             * program should terminate.*/
            if(!sale.checkID())
            {
                System.out.println("Too young to view this film");
                System.exit(1);
            }
        }
        //Do not change (it will help you check your code).
        System.out.print(sale);
    }
}
