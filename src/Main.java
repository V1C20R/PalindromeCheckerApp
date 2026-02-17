import java.util.Scanner;

class PalindromeChecker{
    boolean isPalindrome(String str) {
        int f = 0;
        int l = str.length() - 1;
        int count = 0;
        while (f < l) {
            if (str.charAt(f) != str.charAt(l)) {
                return false;
            }
            f++;
            l--;
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
        System.out.println(c.isPalindrome(str) ? "Yes" : "No");
    }
}