import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Text: ");
        String text = sc.next();
        int n= text.length();
        System.out.println(text);
        String newText="";
        for(int i=n-1; i>=0; i--){
            newText= newText + text.charAt(i);
        }
        if(text.equals(newText)){
            System.out.println("Is it a palindrome? : True");
        }
        else{
            System.out.println("Is it a palindrome? : False");
        }
    }
}
