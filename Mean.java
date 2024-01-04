import java.util.Scanner;
public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements :");
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float mean = (float) sum /5;
        System.out.println("Mean : "+mean);
    }
}
