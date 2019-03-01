package util.reader;

import util.validator.DataValidatorable;

import java.io.File;

public interface DataFileReadable {
    String fileRaderString(File file, DataValidatorable unverified) throws WrongFileExaprion;
}
