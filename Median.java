import java.util.Scanner;
public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Median is : "+arr[median(arr)]);
    }
    public static int median(int[] arr){
        int mid = (1+arr.length)/2;
        return mid-1;
    }
}
