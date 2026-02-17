import java.util.Scanner;

class check_palindrome {
    boolean isPalindrome(int number) {
        String n = String.valueOf(number);
        int f = 0;
        int l = n.length() - 1;
        int count = 0;
        while (f < l) {
            if (n.charAt(f) != n.charAt(l)) {
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
        check_palindrome c = new check_palindrome();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        System.out.println(c.isPalindrome(n) ? "Yes" : "No");
    }
}
