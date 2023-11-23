import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternCheck {
    public static void main(String[] args) {
        // The string to be checked
        String inputString = "This is a sample string with a specific pattern ABC123.";

        // The pattern to be matched
        String patternToMatch = "ABC\\d+";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(patternToMatch);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(inputString);

        // Check if the pattern is found
        if (matcher.find()) {
            System.out.println("The pattern is found in the string.");
        } else {
            System.out.println("The pattern is not found in the string.");
        }
    }
}
