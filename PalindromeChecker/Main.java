package PalindromeChecker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        System.out.print("Enter a word:");
        String text= scanner.nextLine();
        char[] letters = text.toCharArray();

        for (char c : letters) {
            palindromeChecker.add(c);
        }
        
        System.out.println(palindromeChecker.ifPalindrome(text));
        
        
    }
}
