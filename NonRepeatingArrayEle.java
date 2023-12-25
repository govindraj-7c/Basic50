import java.util.Arrays;
import java.util.Scanner;
public class NonRepeatingArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        frequency(arr);
    }
    public static void frequency(int[] arr){
        boolean value[] = new boolean[arr.length];
        Arrays.fill(value,false);
        for(int i=0; i<arr.length; i++){
            if(value[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    value[j] = true;
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]+" : "+count);
            }
        }
    }
}
