package util.validator;

import java.io.ObjectInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDataValidator implements DataValidatorable {

    private static final Pattern VALID_STRING_PATTERN = Pattern.compile("^(\\D+\\s*)+(\\D+\\s*)$");

    public boolean isValidData(String unverifiedString) {

        Matcher matcher = VALID_STRING_PATTERN.matcher(unverifiedString);
        if (matcher.find()) {
            return true;
        }
        return matcher.find();
    }


}
