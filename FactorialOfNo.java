import java.util.Scanner;
public class FactorialOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int no = sc.nextInt();
        System.out.println("Factorial is "+factorial(no));
    }
    public static int factorial(int no){
        if(no == 1){
            return 1;
        }
        return no*factorial(no-1);
    }
}
