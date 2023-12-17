import java.util.Scanner;
public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String value :");
        String word = sc.nextLine();
        System.out.println("Enter Old Sub String :");
        String oldString = sc.nextLine();
        System.out.println("Enter New Sub String :");
        String newString = sc.nextLine();
        word = word.replace(oldString,newString);
        System.out.println(word);
    }
}
