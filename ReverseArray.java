import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse array :");
        for(int i=4; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
