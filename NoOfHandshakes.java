import java.util.Scanner;
public class NoOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of People:");
        int peo = sc.nextInt();
        handshakes(peo);
    }
    public static void handshakes(int no){
        int res = no*(no-1)/2;
        System.out.println("No of Handshakes : " +res);
    }
}
