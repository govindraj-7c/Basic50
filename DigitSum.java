import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int no = sc.nextInt();
        int sum = 0;
        while(no>0){
            int rem = no%10;
            sum += rem;
            no = no/10;
        }
        System.out.println("Addition is :"+sum);
    }
}
