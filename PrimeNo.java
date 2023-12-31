import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        prime(no);
    }
    public static void prime(int no){
        int count = 0;
        if(no<2){
            System.out.println(no+" is not a Prime Number.");
            System.exit(0);
        }
        for(int i=1; i<=no; i++){
            if(no%i == 0){
                count += 1;
            }
        }
        if(count>2){
            System.out.println(no+" is not a Prime Number..");
        }
        else{
            System.out.println(no+" is a Prime Number..");
        }
    }
}
