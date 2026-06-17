import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Remove element
        fruits.remove("Banana");
        System.out.println("After Removing Banana: " + fruits);

        // Search element
        String searchItem = "Mango";

        if (fruits.contains(searchItem)) {
            System.out.println(searchItem + " found in the list.");
        } else {
            System.out.println(searchItem + " not found in the list.");
        }

        // Iterate through ArrayList
        System.out.println("Elements in ArrayList:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}