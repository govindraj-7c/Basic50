import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Word : ");
        String word = sc.next();
        palindrome(word);
    }
    public static void palindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        String rev = sb.reverse().toString();
        if(word.equals(rev)){
            System.out.println(word+" is a Palindrome String");
        }
        else{
            System.out.println(word+" is not a Palindrome String");
        }
    }
}
