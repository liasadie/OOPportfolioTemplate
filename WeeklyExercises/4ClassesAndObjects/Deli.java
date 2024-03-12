import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Deli {
    public static void main(String[] args) {
        final double Ounces_Per_Pound = 16.0;

        double PricePerPound;
        double WeightOunces;
        double Weight;
        double totalPrice;

        Scanner scan = new Scanner(System.in);

        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("#.##");

        System.out.println("Welcome to the CS Deli!!\n ");

        System.out.println("Enter the price per pound of your item: ");
        PricePerPound = scan.nextDouble();

        System.out.print("Enter the weight (ounces): ");
        WeightOunces = scan.nextDouble();

        Weight = WeightOunces / Ounces_Per_Pound;
        totalPrice = PricePerPound * Weight;

        System.out.println("\t ***** CS Deli ***** \t\t");
        System.out.println("\t");
        System.out.println("\tUnit price: " + money.format(PricePerPound) + " per pound");
        System.out.println("\tWeight: " + fmt.format(Weight) + " pounds");
        System.out.println("\t");
        System.out.println("\tTOTAL: " + money.format(totalPrice));

    }
}


