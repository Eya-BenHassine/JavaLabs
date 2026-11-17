package Lab3;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> notes = new ArrayList<>();

        notes.add(12);
        notes.add(15);
        notes.add(9);
        notes.add(17);
        notes.add(14);

        System.out.println("Notes: " + notes);
        System.out.println("Number of notes: " + notes.size());

        notes.set(2, 11);
        notes.remove(0);

        System.out.println("Final list: " + notes);
    }
}