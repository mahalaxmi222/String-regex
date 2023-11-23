import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        // The text containing email addresses
        String inputText = "This is a sample text with email addresses: john@example.com, alice@email.com, info@company.com";

        // Regular expression pattern for matching email addresses
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(inputText);

        // Find and print all email addresses in the text
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println("Found email address: " + email);
        }
    }
}
