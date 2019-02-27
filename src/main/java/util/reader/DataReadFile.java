package util.reader;

import util.validator.DataValidator;

import java.io.File;

public interface DataReadFile {
    String fileRaderString(File file, DataValidator unverified) throws WrongFileExaprion;
}
