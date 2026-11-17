package Lab3.Exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {

    static Scanner sc = new Scanner(System.in);

    public static void addStudent(ArrayList<String> names, Vector<Integer> ages,
                                  HashMap<String, Double> averages) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        if (names.contains(name)) {
            System.out.println("Student already exists.");
            return;
        }
        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Average: ");
        double avg = Double.parseDouble(sc.nextLine());

        names.add(name);
        ages.add(age);
        averages.put(name, avg);
        System.out.println("Student added.");
    }

    public static void displayStudents(ArrayList<String> names, Vector<Integer> ages,
                                       HashMap<String, Double> averages) {
        if (names.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name + " | Age: " + ages.get(i) + " | Average: " + averages.get(name));
        }
    }

    public static void searchStudent(ArrayList<String> names, Vector<Integer> ages,
                                     HashMap<String, Double> averages) {
        System.out.print("Name to search: ");
        String name = sc.nextLine();
        int i = names.indexOf(name);
        if (i == -1) {
            System.out.println("Student not found.");
        } else {
            System.out.println(name + " | Age: " + ages.get(i) + " | Average: " + averages.get(name));
        }
    }

    public static void updateAverage(HashMap<String, Double> averages) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        if (!averages.containsKey(name)) {
            System.out.println("Student not found.");
            return;
        }
        System.out.print("New average: ");
        double avg = Double.parseDouble(sc.nextLine());
        averages.put(name, avg);
        System.out.println("Average updated.");
    }

    public static void deleteStudent(ArrayList<String> names, Vector<Integer> ages,
                                     HashMap<String, Double> averages) {
        System.out.print("Name to delete: ");
        String name = sc.nextLine();
        int i = names.indexOf(name);
        if (i == -1) {
            System.out.println("Student not found.");
            return;
        }
        names.remove(i);
        ages.remove(i);
        averages.remove(name);
        System.out.println("Student deleted.");
    }

    public static double calculateOverallAverage(HashMap<String, Double> averages) {
        if (averages.isEmpty()) return 0;
        double sum = 0;
        for (double v : averages.values()) {
            sum += v;
        }
        return sum / averages.size();
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Vector<Integer> ages = new Vector<>();
        HashMap<String, Double> averages = new HashMap<>();

        int choice;
        do {
            System.out.println("========== STUDENT MANAGEMENT ==========");
            System.out.println("1. Add a student");
            System.out.println("2. Display students");
            System.out.println("3. Search for a student");
            System.out.println("4. Update an average");
            System.out.println("5. Delete a student");
            System.out.println("6. Display overall average");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: addStudent(names, ages, averages); break;
                case 2: displayStudents(names, ages, averages); break;
                case 3: searchStudent(names, ages, averages); break;
                case 4: updateAverage(averages); break;
                case 5: deleteStudent(names, ages, averages); break;
                case 6:
                    if (averages.isEmpty()) System.out.println("No students.");
                    else System.out.println("Overall average: " + calculateOverallAverage(averages));
                    break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}