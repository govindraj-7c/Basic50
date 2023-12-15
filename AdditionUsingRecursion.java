import java.util.Scanner;
public class AdditionUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = sc.nextInt();
        System.out.println("Addition of first "+no+" Natural No is "+sumOfNosUsingRecursion(no));
    }
    public static int sumOfNosUsingRecursion(int no){
        if(no == 0){
            return no;
        }
        return no + sumOfNosUsingRecursion(no-1);
    }
}
