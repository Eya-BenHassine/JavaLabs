package Lab3;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("E001", 15);
        students.put("E002", 12);
        students.put("E003", 18);
        students.put("E004", 9);

        System.out.println("E002 grade: " + students.get("E002"));

        students.put("E004", 11);

        System.out.println("E005 exists? " + students.containsKey("E005"));

        students.remove("E001");

        for (Map.Entry<String, Integer> e : students.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}