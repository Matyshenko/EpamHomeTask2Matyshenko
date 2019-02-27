package util.validator;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDataValidator implements DataValidator {

    private static final String VALID_STRING_ = "^(\\D+\\s*)+(\\D+\\s*)$";
    //private static final String REGEX = "^([a-zA-Zа-яА-Я]+\\s+)";
    // private static final String REGEX = "^[a-zA-z][а-яА-я]+";
    //^((\d+)\.\d+ ?)++$

    public boolean isValidData(String unverified) {
        Pattern pattern = Pattern.compile(VALID_STRING_);
        Matcher matcher = pattern.matcher(unverified);
        if (matcher.find()) {
            return true;
        }
        return matcher.find();
    }


}
