import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        // Example 1: Matching a specific pattern
        String input1 = "Hello123";
        String pattern1 = "^[a-zA-Z]+$"; // Only letters allowed

        boolean match1 = Pattern.matches(pattern1, input1);
        System.out.println("Example 1 - Only letters allowed:");
        System.out.println("Input: " + input1);
        System.out.println("Match: " + match1);
        System.out.println();

        // Example 2: Extracting numbers from a string
        String input2 = "abc123xyz456";
        String pattern2 = "\\d+"; // Match one or more digits

        Pattern patternObj2 = Pattern.compile(pattern2);
        Matcher matcher2 = patternObj2.matcher(input2);

        System.out.println("Example 2 - Extracting numbers:");
        System.out.println("Input: " + input2);
        while (matcher2.find()) {
            System.out.println("Number found: " + matcher2.group());
        }
    }
}
