import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any No :");
        int no = sc.nextInt();
        if(armstrong(no)){
            System.out.println(no+" is Armstrong Number.");
        }
        else{
            System.out.println(no+" is Not Armstrong Number.");
        }
    }
    public static boolean armstrong(int no){
        int temp = no;
        int res = 0;
        while(no > 0){
            int rem = no%10;
            res = res + (rem*rem*rem);
            no = no/10;
        }
        return res == temp;
    }
}
