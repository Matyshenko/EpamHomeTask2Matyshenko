package util.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDataValidator implements DataValidatorable {

    private static final String VALID_STRING = "^(\\D+\\s*)+(\\D+\\s*)$";

    public boolean isValidData(String unverifiedString) {

        Pattern pattern = Pattern.compile(VALID_STRING);
        Matcher matcher = pattern.matcher(unverifiedString);
        if (matcher.find()) {
            return true;
        }
        return matcher.find();
    }


}
