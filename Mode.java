import java.util.Scanner;
public class Mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements:");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Mode : "+mode(arr));
    }
    public static int mode(int[] arr){
        int maxCount = 0, count = 0, ele = 0;
        for(int i=0; i<5; i++){
            count = 1;
            for(int j=i+1; j<5; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxCount){
                ele = arr[i];
                maxCount = count;
                count = 0;
            }
        }
        return ele;
    }
}
