import java.util.Scanner;
public class Fraction
{
    public static void main(String[] args)
    {
        int numerator, denominator;
        double decimal;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        numerator = input.nextInt();

        System.out.print("Enter the denominator: ");
        denominator = input.nextInt();

        decimal = (double) numerator / denominator;

        System.out.println(numerator + "/" + denominator + " = " + decimal);

    }
}
