import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add students and grades
        studentGrades.put("Ayushman", 85);
        studentGrades.put("Rahul", 90);
        studentGrades.put("Priya", 88);

        System.out.println("Original Records:");
        System.out.println(studentGrades);

        // Retrieve grade
        String student = "Rahul";
        if (studentGrades.containsKey(student)) {
            System.out.println(student + "'s Grade: " + studentGrades.get(student));
        }

        // Update grade
        studentGrades.put("Rahul", 95);
        System.out.println("Updated Rahul's Grade: " + studentGrades.get("Rahul"));

        // Iterate through HashMap
        System.out.println("\nStudent Records:");

        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}