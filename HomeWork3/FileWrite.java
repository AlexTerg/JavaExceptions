package Seminars_Exceptions.HomeWork.HomeWork3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Запись данных в файл
 */
public class FileWrite {
    public void write(Human human) throws IOException {
        File file = new File(human.getFirstName() + ".txt");
        try (FileWriter fstream = new FileWriter(file, true);) {
            fstream.write("<" + human.getFirstName() + ">" + "<" + human.getSecondName() + ">" + "<"
                    + human.getThridName() + ">" +
                    "<" + human.getBirthday() + ">" + "<" + human.getPhone() + ">" + "<" + human.getGender() + ">\n");
            fstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
