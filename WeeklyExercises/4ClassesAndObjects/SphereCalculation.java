import java.util.Scanner;
public class SphereCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = 4.0 * Math.PI * Math.pow(radius, 3) / 3;
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Volume of the sphere: %.4f%n", volume);
        System.out.printf("Surface area of the sphere: %.4f%n", surfaceArea);
    }
}
