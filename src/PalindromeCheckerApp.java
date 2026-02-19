import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {

        char[] character = input.toCharArray();

        int left = 0;
        int right = character.length - 1;

        while (left < right) {
            if (character[left] != character[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
