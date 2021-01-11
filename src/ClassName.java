import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName { //a-zA-Z0-9
    private static final String CLASSNAME_REGEX = "^[CAP]+[a-zA-Z0-9\\+]*[0-9]{4}+[GHIKLM]*$";
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
