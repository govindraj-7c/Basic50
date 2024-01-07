import java.util.Scanner;
public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        String no = sc.next();
        String ans = "";
        char[] arrNo = no.toCharArray();
        for(int i=0; i<arrNo.length; i++){
            if(arrNo[i] == '0'){
                arrNo[i] = '1';
            }
            ans = ans + arrNo[i];
        }
        System.out.println(ans);
    }
}
