import java.util.Scanner;
public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        automorphic(no);
    }
    public static void automorphic(int no){
        String s1 = Integer.toString(no);
        String s2 = Integer.toString(no*no);
        String s3 = s2.substring(s2.length()-s1.length());
        if(s3.equals(s1)){
            System.out.println(no+" is Automorphic Number.");
        }
        else{
            System.out.println(no+" is not Automorphic Number.");
        }
    }
}
