public class DigitReplacement {
    public static void main(String[] args) {
        // The original string with digits
        String originalString = "This is a sample string with digits: 12345 and 67890.";

        // Regular expression pattern for matching digits
        String digitPattern = "\\d";

        // Replace digits with "*"
        String modifiedString = originalString.replaceAll(digitPattern, "*");

        // Print the modified string
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
