import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;
        String computerPlay = "";
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Enter your play (R,P,S): ");
        personPlay = scan.nextLine().toUpperCase();

        computerInt = generator.nextInt(3);

        switch (computerInt)
        {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
        }

        System.out.println("Computer play is: " + computerPlay);

        if (personPlay.equals(computerPlay))
        {
            System.out.println("It's a tie!");
        }
        else if (personPlay.equals("R"))
        {
            if (computerPlay.equals("S"))
            {
                System.out.println("Rock crushes scissors. You win!!");
            }
            else {
                System.out.println("Paper covers rock. Computer wins.");
            }
        }
        else if (personPlay.equals("P"))
        {
            if (computerPlay.equals("S"))
            {
                System.out.println("Scissors cut paper. Computer wins. ");
            }
            else
            {
                System.out.println("Paper covers rock. You win!!");
            }
        }
        else {
            if (computerPlay.equals("P"))
            {
                System.out.println("Scissors cut paper. You win!!");
            }
            else {
                System.out.println("Rock crushes scissors. Computer wins.");
            }
        }
    }
}
