import java.util.Scanner;
public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String:");
        String word = sc.next();
        char[] ch = word.toCharArray();
        int count = 0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count++;
            }
        }
        System.out.println("Count of Vowels : "+count);
    }
}
