import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of No. Of People:");
        int n = sc.nextInt();
        System.out.println("Enter Value Of No. Of Seats:");
        int r = sc.nextInt();
        if(n<r){
            System.out.println("Wrong Inputs..");
        }
        else{
            int neu = factorial(n);
            int dem = factorial(n-r);
            int res = neu/dem;
            System.out.println("Total Possible Arrangements : "+res);
        }
    }
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
