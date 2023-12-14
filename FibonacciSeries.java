import java.util.Scanner;
public class FibonacciSeries {
    static int n1 = 0, n2 = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth Number : ");
        int no = sc.nextInt();
        System.out.print(n1+" "+n2);
        fibonacci(no-2);
    }
    public static void fibonacci(int no){
        int n3;
        if(no > 0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacci(no-1);
        }
    }
}
