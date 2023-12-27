import java.util.Arrays;
import java.util.Scanner;
public class AscendingDecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<=4; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=9; i>=5; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
