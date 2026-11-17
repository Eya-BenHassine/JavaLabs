package Lab4.Ex4;

import java.time.LocalDate;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Birth date (yyyy-mm-dd): ");
        LocalDate birth = LocalDate.parse(sc.nextLine());
        System.out.print("Hire date (yyyy-mm-dd): ");
        LocalDate hire = LocalDate.parse(sc.nextLine());
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, lastName, firstName, birth, hire, salary);
        e.displayEmployee();

        e.increaseSalary();
        System.out.println("After increase: " + e.getSalary());
    }
}