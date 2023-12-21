import java.util.Scanner;
public class PowerOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = sc.nextInt();
        System.out.println("Enter pow:");
        int pow = sc.nextInt();
        int res = 1;
        for(int i=0; i<pow; i++){
            res = res*no;
        }
        System.out.println(no+" to the power "+pow+" is "+res);
    }
}
