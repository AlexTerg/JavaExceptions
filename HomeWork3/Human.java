package Seminars_Exceptions.HomeWork.HomeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Human {
    private String firstName;
    private String secondName;
    private String thridName;
    private String birthday;
    private String phone;
    private Gender gender;

    public Human(String firstName, String secondName, String thridName, String birthday, String phone, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thridName = thridName;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (isName(firstName)) {
            throw new NameException(firstName);
        }
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (isName(secondName)) {
            throw new NameException(secondName);
        }
        this.secondName = secondName;
    }

    public String getThridName() {
        return thridName;
    }

    public void setThridName(String thridName) {
        if (isName(thridName)) {
            throw new NameException(thridName);
        }
        this.thridName = thridName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (!checkLengthYear(birthday) | !checkBirthday(birthday)) {
            throw new DateException(birthday);
        }
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 11 && isPhone(phone)) {
            this.phone = phone;
        } else {
            throw new PhoneException(phone);
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.toLowerCase().equals("f")) {
            this.gender = Gender.f;
        } else if (gender.toLowerCase().equals("m")) {
            this.gender = Gender.m;
        } else {
            throw new RuntimeException("Введите f или m");
        }
    }

    // Методы проверки валидности данных
    private boolean isName(String text) {
        for (char string : text.toCharArray()) {
            if (Character.isDigit(string)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPhone(String text) {
        for (char string : text.toCharArray()) {
            if (!Character.isDigit(string)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkBirthday(String bith) {
        SimpleDateFormat date = new SimpleDateFormat("dd.M.yyyy");
        try {
            date.setLenient(false);
            date.parse(bith);
            return true;
        } catch (ParseException e) {

        }
        return false;
    }

    private boolean checkLengthYear(String bith) {
        String[] arrayBith = bith.split("\\.");
        if (arrayBith[2].length() != 4) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Human [firstName=" + firstName + ", secondName=" + secondName + ", thridName=" + thridName
                + ", birthday=" + birthday + ", phone=" + phone + ", gender=" + gender + "]";
    }

}
