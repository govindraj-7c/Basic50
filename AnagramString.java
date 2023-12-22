import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        String string1 = sc.next();
        String string2 = sc.next();
        if (anagram(string1, string2)) {
            System.out.println("Anagram Strings");
        }
        else{
            System.out.println("Not Anagram Strings");
        }
    }
    public static boolean anagram(String s1, String s2){
        String str1 = s1.replaceAll("[//s]","");
        String str2 = s2.replaceAll("[//s]","");
        boolean result;
        if(str1.length() != str2.length()){
            result = false;
        }
        else{
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            result = Arrays.equals(ch1,ch2);
        }
        return result;
    }
}
