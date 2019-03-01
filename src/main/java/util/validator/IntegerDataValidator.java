package util.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerDataValidator implements DataValidatorable {

    private static final String VALID_INTEGER = "^((\\d+)\\d+ ?)++$";

    @Override
    public boolean isValidData(String unverifiedInteger) {
        Pattern pattern = Pattern.compile(VALID_INTEGER);
        Matcher matcher = pattern.matcher(unverifiedInteger);
        if (matcher.find()) {
            return true;
        }
        return matcher.find();
    }

}
