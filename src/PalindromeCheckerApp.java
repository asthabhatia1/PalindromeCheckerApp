import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//new code
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");
        // Define the input string to validate
        String input = "civic";
        System.out.println("Input : " + input);

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // dequeue() vs pop()
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("System initialized successfully..");
    }
