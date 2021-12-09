import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Matcher matcher;
    private Pattern pattern;
    private static final String regex= "^[CAP]+[0-9]{4}[GHIKLM]$";

    public ValidateClass(){}

    public boolean validate(String s){
        pattern= Pattern.compile(regex);
        matcher= pattern.matcher(s);
        return matcher.matches();
    }

}
