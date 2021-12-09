import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Matcher matcher;
    private static Pattern pattern;
    public static final String accountRegex= "^[_a-z0-9]{6,}$";


    public void AccountExample(){
    }

    public boolean validate(String s){
        pattern= Pattern.compile(accountRegex);
        matcher= pattern.matcher(s);
        return matcher.matches();
    }
}
