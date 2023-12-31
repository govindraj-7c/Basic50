import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {
        PrimeInRange PR = new PrimeInRange();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int no = sc.nextInt();
        PR.primeRange(no);
    }
    void primeRange(int no){
        int count =0;
        System.out.print("1 ");
        for(int i=2; i<=no; i++){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    count+=1;
                }
            }
            if(count<=2){
                System.out.print(i+" ");
            }
            count =0;
        }
    }
}
