
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 5.0");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Input : " + input);
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("System initialized successfully..");
    }
}