import java.util.Scanner;
public class GCDProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int n = 1;
        if(no1!=no2){
            while(n != 0){
                n = no1 % no2;
                if(n != 0){
                    no1 = no2;
                    no2 = n;
                }
            }
            System.out.println("GCD is "+no2);
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
