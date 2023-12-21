import java.util.Scanner;
public class ReplaceWhiteSpacesfromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String word = "govind raj";
        String res = word.replaceAll(" ","");
        System.out.println(res);
    }
}
