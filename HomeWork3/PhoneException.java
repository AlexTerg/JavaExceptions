package Seminars_Exceptions.HomeWork.HomeWork3;

public class PhoneException extends RuntimeException {
    public PhoneException() {
        super("Phone number exception");
    }

    public PhoneException(String phone) {
        super("Phone number exception " + phone);
    }

}
