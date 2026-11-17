package Lab2;

public class Vowels {
    public static void main(String[] args) {
        String word = "computer science";
        String vowels = "aeiou";

        for (int i = 0; i < vowels.length(); i++) {
            char v = vowels.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == v) count++;
            }
            if (count == 1)
                System.out.println("The vowel \"" + v + "\" appears 1 time");
            else
                System.out.println("The vowel \"" + v + "\" appears " + count + " times");
        }
    }
}