import java.util.Scanner;

class PalindromeChecker{
    boolean isPalindrome(String str) {
        char[] c = str.toCharArray();
        int start=0,end=str.length()-1;
        while(start<end){
            if(c[start]!= c[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args){
        PalindromeChecker c = new PalindromeChecker();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        System.out.println("Is it a palindrome string? ");
        System.out.println(c.isPalindrome(str) ? "Yes" : "No");
    }
}