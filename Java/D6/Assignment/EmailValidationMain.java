package Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationMain {
    static boolean isValidEmail(String email) {
        Pattern VALID_EMAIL_REGEX =
                Pattern.compile("^[A-Z0-9._]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_REGEX.matcher(email);
        return matcher.find();
    }

    public static void main(String[] args) {
        String email = "abc@gmail.org";
        if (isValidEmail(email))
            System.out.println("Your email address is valid");
        else
            System.out.println("Your email address is invalid");
    }
}
