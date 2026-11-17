package Lab1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
            else System.out.println("Correct!");
        } while (guess != secret);

        System.out.println("You found it in " + attempts + " attempts.");
    }
}