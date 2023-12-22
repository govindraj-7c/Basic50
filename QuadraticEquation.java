import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2+bx+c=0");
        System.out.println("Enter Values of a, b & c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        equation(a,b,c);
    }
    public static void equation(int a, int b, int c){
        int res;
        if(a==0){
            System.out.println("Invalid Input");
        }
        int d = (b*b)-4*a*c;
        double sqrt_val = Math.sqrt(Math.abs(d));
        if(d>0){
            System.out.println("Roots are real and different");
            System.out.println((-b+sqrt_val)/(2*a)+"\n"+(-b-sqrt_val)/(2*a));
        } else if (d==0) {
            System.out.println("Roots are real and same");
            System.out.println((-b/(2*a))+"\n"+(-b/(2*a)));
        }
        else{
            System.out.println("Roots are Imaginary");
            System.out.println((-b/(2*a))+"+i"+sqrt_val+"\n"+(-b/(2*a))+"-i"+sqrt_val);
        }
    }
}
