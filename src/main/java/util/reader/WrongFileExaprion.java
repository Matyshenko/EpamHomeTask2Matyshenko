package util.reader;

public class WrongFileExaprion extends Exception {
    public WrongFileExaprion() {
    }

    public WrongFileExaprion(String message) {
        super(message);
    }

    public WrongFileExaprion(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFileExaprion(Throwable cause) {
        super(cause);
    }

    public WrongFileExaprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
