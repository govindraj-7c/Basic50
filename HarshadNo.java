import java.util.Scanner;
public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int no = sc.nextInt();
        isharshad(no);
    }
    public static void isharshad(int no){
        int sum = 0;
        int temp = no;
        while(no > 0){
            int rem = no%10;
            sum += rem;
            no = no/10;
        }
        if(temp%sum == 0){
            System.out.println(temp+" is Harshad Number.");
        }
        else{
            System.out.println(temp+" is not Harshad Number.");
        }
    }
}
