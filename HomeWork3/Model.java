package Seminars_Exceptions.HomeWork.HomeWork3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {
    private Human human = new Human();
    private List<Human> humanList = new ArrayList<Human>();
    private FileWrite file = new FileWrite();

    public void start() {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "Введите данные формата: Фамилия Имя Отчество Дата рождения(dd.mm.yyyy) Номер телефона Пол(f-женский/m-мужской)");

            String[] arrayHuman = scn.nextLine().split(" ");

            if (isCorrectedLength(arrayHuman)) {
                human.setFirstName(arrayHuman[0]);
                human.setSecondName(arrayHuman[1]);
                human.setThridName(arrayHuman[2]);
                human.setBirthday(arrayHuman[3]);
                human.setPhone(arrayHuman[4]);
                human.setGender(arrayHuman[5]);
                humanList.add(human);
                try {
                    file.write(human);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
        scn.close();

    }

    private boolean isCorrectedLength(String[] str) {
        if (str.length != 6) {
            throw new IndexOutOfBoundsException(
                    "Введите данные в формате: Фамилия Имя Отчество dd.mm.yyyy телефон пол");
        }
        return true;
    }

}
