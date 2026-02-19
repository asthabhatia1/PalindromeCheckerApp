import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Text: ");
        String text = sc.next();
        int n= text.length();
        System.out.println(text);
        int flag = 0;
        for(int i=0; i<n; i++){
            if ( text.charAt(i)!=text.charAt(n-1-i)){
                flag =1;
            }
        }
        if( flag ==0){
            System.out.println("Is it a palindrome? : True");
        }
        else{
            System.out.println("Is it a palindrome? : False");
        }
    }
}
