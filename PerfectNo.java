import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int no = sc.nextInt();
        perfect(no);
    }
    public static void perfect(int no){
        int sum = 0;
        for(int i=1; i<no; i++){
            if(no%i == 0){
                sum += i;
            }
        }
        if(sum == no){
            System.out.println(no+" is a Perfect Number");
        }
        else{
            System.out.println(no+" is not a Perfect Number");
        }
    }
}
