import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int no = sc.nextInt();
        for(int i=0; i<no; i++){
            for(int j=i; j<no; j++){
                System.out.print(" ");
            }
            for(int j=0; j<no; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
