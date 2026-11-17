package Lab1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Good evening------");
        System.out.print("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int b = sc.nextInt();

        System.out.println("--------Calculate--------");
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(b + "*" + a + "=" + (a * b));
        if (b != 0)
            System.out.println(a + "/" + b + "=" + (a / b));
        else
            System.out.println("Division by zero is impossible");
        System.out.println("-------Bye-------");
    }
}