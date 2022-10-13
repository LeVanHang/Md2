package controller;

import model.Lop;
import model.Student;
import storage.ReadData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ReadData readWriteData = new ReadData();

     ArrayList<Lop> lops = new ArrayList<>();


    public StudentManager() {
        lops.add(new Lop(1, "C0722G1"));
        lops.add(new Lop(2, "C0822I1"));
    }

    public Student createStudent() {
        System.out.println("Enter student name");
        String name = scanner.nextLine();
        System.out.println("Enter student ID");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student gender");
        String gender = scanner.nextLine();
        System.out.println("Enter student age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student phone number");
        String phone = String.valueOf(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter student address");
        String address = scanner.nextLine();
        System.out.println("Enter student average score");
        double averageScore = scanner.nextDouble();
        Date date = null;
        while (true) {
            System.out.println("Enter the student's birthDay in the format dd/MM/yyyy ");
            String birthday = scanner.nextLine();
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
            } catch (ParseException e) {
                System.out.println("Wrong format");
                throw new RuntimeException(e);
            }
            break;
        }
        for (int i = 0; i < lops.size(); i++) {
            System.out.println(i + 1 + " : " + lops.get(i).getName());
        }
        System.out.println("Please choose the class in order");
        int choice = Integer.parseInt(scanner.nextLine());
        Lop lop = lops.get(choice - 1);

        Student student = new Student(name, ID, gender, age, phone, createStudent().getBirthday(), lop, address, averageScore);

        return student;
    }

    public void studentRemove(Scanner scanner) {
        boolean check = false;
        System.out.print("Enter Id want Delete");
        int ID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getID(), ID)) {
                students.remove(i);
                System.out.println("Delete successfully!");
            }
        }

        if (!check) {
            System.err.println("No student find!" + ID);
        }
    }

    public void searchMaxAverage() {
        double max = 0;
        int student = 0;
        for (int i = 0; i < students.size(); i++) {
            if (max < students.get(i).getAge()) {
                max = students.get(i).getAge();
                student = 1;
            }

            System.out.println("The student with the highest score is");
            System.out.println(students.get(student));

        }
    }

    public void editStudent(Scanner scanner) {
        System.out.println("Enter student ID want edit");
        String ID = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName()) {
                System.out.println("Enter student new name");
                String name = scanner.nextLine();
                System.out.println("Enter stdent age");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter student new phone");
                String phone = scanner.nextLine();
                System.out.println("Enter birthday student");
                Date date = new Date();
                System.out.println("Enter address sutudent");
                String address = scanner.nextLine();
                double averageScor = scanner.nextDouble();
                students.get(i).setID(createStudent().getID());
                students.get(i).setName(name);
                students.get(i).getAge();
                students.get(i).setPhone(phone);
                System.out.println("Successful product repair!");

            }
        }
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.createStudent().toString());
    }

    public void displayStudent() {

    }

    public void addStudent(Scanner scanner) {

    }
}

