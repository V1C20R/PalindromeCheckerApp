import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {
    boolean isPalindrome(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (s.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        PalindromeChecker c = new PalindromeChecker();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = input.nextLine();

        System.out.println("Is it a palindrome string?");
        System.out.println(c.isPalindrome(str) ? "Yes" : "No");
    }
}