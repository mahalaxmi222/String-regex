import java.util.regex.Pattern;

public class StringPatternMatcher {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        // Check if the input contains the word "fox"
        boolean containsFox = Pattern.compile("\\bfox\\b").matcher(input).find();

        System.out.println("Does the string contain 'fox'? " + containsFox);
    }
}
