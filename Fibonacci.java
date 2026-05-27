import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = 0, second = 1, next;

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for(int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
