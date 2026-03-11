import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class PalindromeChecker{
    boolean isPalindrome(String str){
        Deque<Character> q = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++){
            q.addLast(str.charAt(i));
        }

        for(int i = 0; i < str.length()/2; i++){
            if(q.removeFirst() != q.removeLast()){
                return false;
            }
        }
        return true;
    }
}

class Main{
    public static void main(String[] args){
        PalindromeChecker c = new PalindromeChecker();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = input.nextLine();

        System.out.println("Is it a palindrome string?");
        System.out.println(c.isPalindrome(str) ? "Yes" : "No");
    }
}