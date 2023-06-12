package Seminars_Exceptions.HomeWork.HomeWork2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        getException();
    }

    public static void getException() {
        Scanner scn = new Scanner(System.in);
        if (scn.nextLine().isEmpty()) {
            throw new NullPointerException("Пустую строку вводить нельзя");
        }
    }
}
