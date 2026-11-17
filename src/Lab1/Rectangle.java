package Lab1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.println("Perimeter = " + 2 * (length + width));
        System.out.println("Area = " + length * width);
    }
}