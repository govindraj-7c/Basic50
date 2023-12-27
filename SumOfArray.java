import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        System.out.println("Addition : "+sum);
    }
}
