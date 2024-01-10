import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter 2 Numbers:");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("Addition : "+(a+b));
                    break;
                case 2 :
                    System.out.println("Enter 2 Numbers:");
                    int c = sc.nextInt(), d = sc.nextInt();
                    System.out.println("Subtraction : "+(c-d));
                    break;
                case 3 :
                    System.out.println("Enter 2 Numbers:");
                    int e = sc.nextInt(), f = sc.nextInt();
                    System.out.println("Multiplication : "+(e*f));
                    break;
                case 4 :
                    System.out.println("Enter 2 Numbers:");
                    int g = sc.nextInt(), h = sc.nextInt();
                    System.out.println("Division : "+(g/h));
                    break;
                case 0 :
                    return;
                default :
                    System.out.println("You Entered Wrong Choice..");
                    break;
            }
        }
    }
}
