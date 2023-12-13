import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int no = sc.nextInt();
        int res = 0;
        while(no > 0){
            int rem = no % 10;
            res = res*10 + rem;
            no = no/10;
        }
        System.out.println("Reverse of "+no+" is "+res);
    }
}
