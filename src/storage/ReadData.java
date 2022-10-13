package storage;


import model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
    private static Object student;

    public static ArrayList<Student> readFileStudentList() {
        try {
            File file = new File("FileStudent.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Student student1 = new Student(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4]);
                Student.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("");
        }
        return (ArrayList<Student>) student;
    }
}