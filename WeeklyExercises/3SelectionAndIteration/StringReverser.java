import java.util.Scanner;
public class StringReverser {
    public static void main(String[] args1) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = inputScanner.nextLine();

        StringBuilder reversedSentence = new StringBuilder();
        Scanner wordScanner = new Scanner(sentence);

        while (wordScanner.hasNext()) {
            String word = wordScanner.next();
            reversedSentence.append(reverseWord(word)).append(" ");
        }
        System.out.println("The new sentence is: " + reversedSentence);

    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() -1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}
