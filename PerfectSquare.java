import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        if(pSquare(no))
            System.out.println(no+" is a Perfect Square..");
        else
            System.out.println(no+" is Not a Perfect Square..");
    }
    public static boolean pSquare(int no){
        if(no>=0){
            int sqrt = (int)Math.sqrt(no);
            return (sqrt*sqrt) == no;
        }
        return false;
    }
}
