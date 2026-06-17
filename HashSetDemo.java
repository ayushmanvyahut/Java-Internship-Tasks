import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        // Add elements (including duplicates)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate
        fruits.add("Orange");

        System.out.println("HashSet Elements:");
        System.out.println(fruits);

        // Check if element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango exists in the HashSet.");
        } else {
            System.out.println("Mango does not exist.");
        }

        // Remove element
        fruits.remove("Banana");

        System.out.println("After removing Banana:");
        System.out.println(fruits);
    }
}