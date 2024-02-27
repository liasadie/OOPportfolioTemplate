import java.util.Scanner;

public class MilesToKM
{
    public static void main(String[] args)
    {
        double miles, km;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        miles = input.nextDouble();

        km = miles * 1.60935;

        System.out.println(miles + " miles is equal to " + km + " kilometers.");
    }
}
