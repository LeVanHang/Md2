package storage;


import model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void writeFileProduct(String File, Student[] Student) {
        try {
            java.io.File file = new File("FileStudent.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student student : Student) {
                bufferedWriter.write(student.getID() + "," + student.getName() + "," + student.getAge() + "," + student.getBirthday() + "," + student.getLop() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("");
        }
    }
}