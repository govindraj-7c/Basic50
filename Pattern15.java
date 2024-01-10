import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        int count = 1;
        for(int i=1; i<=no; i++){
            for(int j=1; j<=no; j++){
                if((i==1 || i==no) || (j==1 || j==no)){
                    System.out.print(" "+i);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
