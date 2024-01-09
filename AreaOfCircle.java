import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r = sc.nextInt();
        System.out.println("Area Of Circle : "+(3.14*r*r));
    }
}
