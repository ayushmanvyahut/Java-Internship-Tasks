import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(56);

        System.out.println("Original List: " + numbers);

        // Sort in Ascending Order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Sort in Descending Order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);

        // Find Minimum and Maximum
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}