package util.reader;
import util.validator.DataValidator;
import java.io.*;

public class DataReader implements DataReadFile {

    public String fileRaderString(File file, DataValidator unverified) throws WrongFileExaprion {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (unverified.isValidData(line)) {
                    stringBuilder.append(line).append(" ");
                }
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new WrongFileExaprion("File not found", e);
        }
    }
}
