package util.txtfilevalidator;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtFileValidator implements ValidateTxt {
    private static final String FILE_NAME = "\\.txt$";

    public boolean validateFile(File file) {
        boolean isValid = false;
        if (file.exists()) {
            String fileName = file.getName();
            Pattern pattern = Pattern.compile(FILE_NAME);
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.find()) {
                return matcher.find();
            }
        }
        return isValid;
    }


}
