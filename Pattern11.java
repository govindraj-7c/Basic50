import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int no = sc.nextInt();
        for(int i=0; i<no; i++){
            for(int j=i; j<no; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=no-1; i>0; i--){
            for(int j=i; j<=no; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
