import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        input = input.toLowerCase().replaceAll("\\s+", "");

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear until deque size is 1 or 0
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Deque-Based Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}