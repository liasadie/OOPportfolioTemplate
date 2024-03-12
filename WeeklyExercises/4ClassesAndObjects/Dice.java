import java.util.Scanner;
import java.util.Random;
public class Dice
{public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("How many sides does die 1 have? ");
    int DieOneSides = scanner.nextInt();
    System.out.println("How many sides does die 2 have? ");
    int DieTwoSides = scanner.nextInt();

    int roll1, roll2;
    int sum1 = 0, sum2 = 0;

    roll1 = random.nextInt(DieOneSides) + 1;
    roll2 = random.nextInt(DieTwoSides) + 1;
    sum1 += roll1;
    sum2 += roll2;
    System.out.println("Die 1 first roll = " + roll1 + ".");
    System.out.println("Die 2 first roll = " + roll2 + ".");

    roll1 = random.nextInt(DieOneSides) + 1;
    roll2 = random.nextInt(DieTwoSides) + 2;
    sum1 += roll1;
    sum2 += roll2;
    System.out.println("Die 1 second roll = " + roll1 + ".");
    System.out.println("Die 2 second roll = " + roll2 + ".");

    roll1 = random.nextInt(DieOneSides) + 1;
    roll2 = random.nextInt(DieTwoSides) + 1;
    sum1 += roll1;
    sum2 += roll2;
    System.out.println("Die 1 third roll = " + roll1 + ".");
    System.out.println("Die 2 third roll = " + roll2 + ".");

    double avg1 = (double) sum1 / 3;
    double avg2 = (double) sum2 / 3;
    System.out.println("Die 1 rolled a total of " + sum1 + " and rolled " + avg1 + " on average");
    System.out.println("Die 2 rolled a total of " + sum2 + " and rolled " + avg2 + " on average");
    }

}
