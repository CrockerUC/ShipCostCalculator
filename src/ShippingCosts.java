import java.util.Scanner;

public class ShippingCosts
{
    public static void main(String[] args)
    {
        double itemPrice;
        double shippingCost;
        double totalCost;
        final double SHIP_RATE = .02;
        final double FREE_SHIPPING_THRESHOLD = 100;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
            shippingCost = itemPrice < FREE_SHIPPING_THRESHOLD ? SHIP_RATE * itemPrice : 0;
            totalCost = itemPrice + shippingCost;
            System.out.println("The item price is $" + itemPrice);
            System.out.println("The total cost is $" + totalCost);
            System.out.println("The shipping cost is $" + shippingCost);
        }
        else
        {
            System.out.println("Invalid input.");
        }
        in.close();
    }
}
