package Seminars_Exceptions.HomeWork.HomeWork3;

public class DateException extends RuntimeException {

    public DateException() {
        super("Format date exception: dd.mm.yyyy");
    }

    public DateException(String date) {
        super("Format date exception: dd.mm.yyyy " + date);
    }
}
