package Seminars_Exceptions.HomeWork.HomeWork3;

public class NameException extends RuntimeException {

    public NameException() {
        super("Format name exception:");
    }

    public NameException(String name) {
        super("Format name exception: " + name);
    }
}
