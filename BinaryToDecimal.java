import java.util.Scanner;
public class BinaryToDecimal {
    public static void binary(int no){
        int res = 0;
        int n = 0;
        while(no > 0){
            int temp = no%10;
            res += (int) (temp*Math.pow(2,n));
            no = no/10;
            n++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Value");
        int binary = sc.nextInt();
        binary(binary);
    }
}
