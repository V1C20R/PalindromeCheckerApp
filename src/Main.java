import java.util.Scanner;

class PalindromeChecker{
    boolean isPalindrome(String str) {
        String a = "";
        for(int i=str.length()-1;i>=0;i--){
            a+=str.charAt(i);
        }
        if(str.equals(a)){
            return true;
        }
        else{
            return false;
        }

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