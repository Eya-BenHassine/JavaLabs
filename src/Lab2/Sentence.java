package Lab2;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence ending with a period: ");
        String sentence = sc.nextLine();


        if (sentence.endsWith(".")) {
            sentence = sentence.substring(0, sentence.length() - 1);
        }

        String[] words = sentence.split(" ");

        int longest = 0;
        for (String w : words) {
            if (w.length() > longest) longest = w.length();
        }

        System.out.println("Number of words: " + words.length);
        System.out.println("Longest word size: " + longest);
    }
}
