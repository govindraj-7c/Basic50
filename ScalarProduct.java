import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class ScalarProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of 1st Array:");
        Integer[] arr1 = new Integer[5];
        for(int i=0; i<5; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 5 elements of 2nd Array:");
        Integer[] arr2 = new Integer[5];
        for(int i=0; i<5; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        int ans = 0;
        for(int i=0; i<5; i++){
            ans = ans+(arr1[i]*arr2[i]);
        }
        System.out.println(ans);
    }
}
