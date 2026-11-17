package Lab4.Ex3;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);
        b.display();
    }
}
