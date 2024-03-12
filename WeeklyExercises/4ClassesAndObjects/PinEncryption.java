import java.util.Scanner;
public class PinEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit PIN number to encrypt: ");
        int pin = scanner.nextInt();

        String hexpin = Integer.toHexString(pin);

        int randomNum1 = (int) (Math.random() * (65536 - 1000)) + 1000;
        int randomNum2 = (int) (Math.random() * (65536 - 1000)) + 1000;
        String hexRandomNum1 = Integer.toHexString(randomNum1);
        String hexRandomNum2 = Integer.toHexString(randomNum2);

        String encryptedPin = hexRandomNum1 + hexpin + hexRandomNum2;

        System.out.println("Your encrypted PIN number is " + encryptedPin + ".");
    }
}
