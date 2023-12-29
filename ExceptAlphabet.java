import java.util.Scanner;
public class ExceptAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String:");
        String word = sc.next();
        word = word.replaceAll("[^a-zA-Z]","");
        System.out.println(word);
    }
}
