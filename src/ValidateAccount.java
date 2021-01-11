import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static final String REGEX="^[_a-z0-9]{6,}$";
    public ValidateAccount(){}
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
