import java.util.Scanner;
import java.util.Stack;

// Service Class
class PalindromeChecker {

    // Public method exposed to user
    public boolean checkPalindrome(String input) {

        // Normalize string
        input = input.toLowerCase();
        input = input.replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare by popping
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }

        sc.close();
    }
}