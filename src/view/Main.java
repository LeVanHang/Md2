package view;


import controller.StudentManager;
import storage.ReadData;
import storage.WriteData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("---- Student Manager ----");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Sort");
            System.out.println("6. Find  max average score ");
            System.out.println("7. read file Csv");
            System.out.println("8. write file Csv");
            System.out.println("0. Exit the program");
            System.out.println("--------------------------------------------------------");
            System.out.print("choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> studentManager.displayStudent();
                case 2 -> studentManager.addStudent(scanner);
                case 3 -> studentManager.editStudent(scanner);
                case 4 -> studentManager.studentRemove(scanner);
                case 5 -> {
                    int choice1;
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1 -> studentManager.searchMaxAverage();
                    }
                }
            }
        } while (true);
    }
}