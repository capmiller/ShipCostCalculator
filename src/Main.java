import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";


        System.out.print("Enter the item price: ");
        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear buffer

            if (itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            } else // have to pay ship costs
            {
                shipCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shipCost;
            }
            // Display results
            System.out.println("Shipping costs are: " + shipCost);
            System.out.println("Total costs are: " + totalCost);
            {

                    trash = in.nextLine();
                    System.out.println("Please enter the item price, not " +trash + "." + trash + "is not a valid number");
                    System.out.println("RUN THE PROGRAM AGAIN!");
                }



        }
    }
}