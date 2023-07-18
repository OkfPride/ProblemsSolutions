package problemssolutions.problems;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidParentheses {

    public static void main(String[] args) {
        boolean b = validParentheses(" ()");
        System.out.println(b);
    }

    public static boolean validParentheses(String parens) {
        try {
            Pattern.compile(parens.replaceAll("[^()]", ""));
            return true;
        } catch(PatternSyntaxException e) {
            return false;
        }
    }

}
