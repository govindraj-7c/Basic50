import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        int count = 1;
        for(int i=1; i<=no; i++){
            for(int j=0; j<i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
