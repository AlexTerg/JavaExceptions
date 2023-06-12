package Seminars_Exceptions.HomeWork.HomeWork2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        while (true) {
        try {
            System.out.println("Введите дробное число");
            Scanner scn = new Scanner(System.in);
            float number = scn.nextFloat();
            scn.close();
            return number;
        } catch (Exception e) {
            System.out.println("Что то пошло не так...");
        }
    }

    
    }
}
