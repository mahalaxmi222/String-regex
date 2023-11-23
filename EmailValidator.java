import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        // Example email addresses
        String email1 = "user@example.com";
        String email2 = "invalid.email@com"; // This is an invalid email

        // Define the regex pattern for a basic email address
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailPattern);

        // Create Matcher objects for each email
        Matcher matcher1 = pattern.matcher(email1);
        Matcher matcher2 = pattern.matcher(email2);

        // Perform the matching
        System.out.println("Email validation for " + email1 + ": " + matcher1.matches());
        System.out.println("Email validation for " + email2 + ": " + matcher2.matches());
    }
}
