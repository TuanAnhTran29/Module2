import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private Matcher matcher;
    private Pattern pattern;
    private String regex= "^[(]+[0-9]{2}[)]+[-]+[(]+[0]+[0-9]{9}[)]+$";

    public ValidatePhoneNumber(){}

    public boolean validate(String strNumber){
        pattern= Pattern.compile(regex);
        matcher= pattern.matcher(strNumber);
        return matcher.matches();
    }
}
