import java.util.Scanner;
public class SquareCalculations
{
    public static void main(String[] args)
    {
        int side, perimeter, area;
        Scanner scan =new Scanner(System.in);

        System.out.print("WHat is the length of the square's side?");
        side = scan.nextInt();

        perimeter = side * 4;

        area = side * side;

        System.out.println("The area of a square with a side with a length of " + side + " is " + area
                + " and the perimeter is " + perimeter);
    }
}
