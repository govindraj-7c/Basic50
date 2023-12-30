import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        int res = 0;
        int temp = no;
        while(no > 0){
            int rem = no%10;
            res = res + factorial(rem);
            no = no/10;
        }
        if(temp == res){
            System.out.println(temp+" is Strong Number.");
        }
        else{
            System.out.println(temp+" is not a Strong Number.");
        }
    }
    public static int factorial(int no){
        if(no == 0){
            return 1;
        }
        return no * factorial(no-1);
    }
}
