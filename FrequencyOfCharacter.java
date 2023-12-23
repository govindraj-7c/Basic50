import java.util.Scanner;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String word = sc.next();
        int[] count = new int[word.length()];
        char[] ch = word.toCharArray();
        for(int i=0; i<word.length(); i++){
            count[i] = 1;
            for(int j=i+1; j<word.length(); j++){
                if(ch[i] == ch[j]){
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }
        for(int i=0; i<ch.length; i++){
            if(ch[i] != ' ' && ch[i] != '0'){
                System.out.println(ch[i]+" : "+count[i]);
            }
        }
    }
}
