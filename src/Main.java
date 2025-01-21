import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number entered by the user
        int number = scanner.nextInt();

        // Determine if the number is odd or even
        if (number % 2 == 0) {
            System.out.println("Output: even");
        } else {
            System.out.println("Output: odd");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}