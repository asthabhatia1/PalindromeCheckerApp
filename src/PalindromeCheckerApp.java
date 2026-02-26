import java.util.*;

// Main Class
public class PalindromeCheckerApp {

    // 1️⃣ Strategy Interface
    interface PalindromeStrategy {
        boolean check(String input);
    }

    // 2️⃣ Stack Strategy
    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            input = normalize(input);

            Stack<Character> stack = new Stack<>();

            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }

            for (char ch : input.toCharArray()) {
                if (ch != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // 3️⃣ Deque Strategy
    static class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            input = normalize(input);

            Deque<Character> deque = new ArrayDeque<>();

            for (char ch : input.toCharArray()) {
                deque.addLast(ch);
            }

            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) {
                    return false;
                }
            }

            return true;
        }
    }

    // 4️⃣ Context Class
    static class PalindromeService {

        private PalindromeStrategy strategy;

        public PalindromeService(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }

    // Common normalization method
    private static String normalize(String input) {
        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    // 5️⃣ Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeService service = new PalindromeService(strategy);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (service.execute(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }

        sc.close();
    }
}