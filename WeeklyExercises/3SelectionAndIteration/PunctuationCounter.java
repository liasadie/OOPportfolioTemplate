public class PunctuationCounter {
    public static void main(String[] args1){
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was " +
                "sure to go. -that was a nice poem- the end.";
        int fullStopCount = 0, commaCount = 0, hyphenCount = 0;

        for (char c : text.toCharArray()) {
            if (c == '.') {
                fullStopCount++;
            }else if (c == ',') {
                commaCount++;
            }else if (c == '-'){
                hyphenCount++;
            }
        }
        System.out.println("\t /////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\t" +
                " --        Punctuation counter   --\n\t \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////");

        System.out.println("\n\tFull Stops\t\tCommas\t\t Hyphens\t\t");
        System.out.println("\t----------\t\t------\t\t -------\t\t");
        System.out.println("\t\t" + fullStopCount + "\t\t\t" + "  " + commaCount + "\t\t\t" + "    " + hyphenCount + "\t\t");
    }
}
