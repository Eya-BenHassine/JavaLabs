package Ex4;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private double salary;

    public Employee(int id, String lastName, String firstName,
                    LocalDate birthDate, LocalDate hireDate, double salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public int age() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public int seniority() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void increaseSalary() {
        int s = seniority();
        if (s < 5) salary = salary * 1.02;
        else if (s < 10) salary = salary * 1.05;
        else salary = salary * 1.10;
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + lastName.toUpperCase() + " " + firstName);
        System.out.println("Age: " + age() + " years");
        System.out.println("Seniority: " + seniority() + " years");
        System.out.println("Salary: " + salary);
    }
}