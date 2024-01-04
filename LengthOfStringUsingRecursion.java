import java.util.Scanner;
public class LengthOfStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String word = sc.next();
        System.out.println("Length : "+length(word));
    }
    public static int length(String word){
        if(word.isEmpty()){
            return 0;
        }
        return 1 + length(word.substring(1));
    }
}
