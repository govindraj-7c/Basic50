import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        for(int i=0; i<no; i++){
            for(int j=0; j<no; j++){
                System.out.print(no+" ");
            }
            System.out.println();
        }
    }
}
