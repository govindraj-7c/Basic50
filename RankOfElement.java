import java.util.Arrays;
import java.util.Scanner;
public class RankOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements :");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        rank(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rank(int[] arr){
        int[] order = Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(order);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(order[j] == arr[i]){
                    arr[i] = j+1;
                    break;
                }
            }
        }
    }
}
