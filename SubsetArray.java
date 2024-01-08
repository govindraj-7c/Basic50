import java.util.Scanner;
public class SubsetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of First Array:");
        int size1 = sc.nextInt();
        System.out.println("Enter Size of Second Array:");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("Enter "+size1+" Elements for Array1");
        for(int i=0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter "+size2+" Elements for Array2");
        for(int i=0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }
        if(subsetArray(arr1,arr2) && arr1.length > arr2.length){
            System.out.println("Array2 is a Subset Of Array1");
        } else if (subsetArray(arr1,arr2) && arr2.length > arr1.length) {
            System.out.println("Array1 is a Subset Of Array2");
        }
        else {
            System.out.println("It is Not a Subset..");
        }
    }
    public static boolean subsetArray(int[] arr1, int[] arr2){
        int count = 0;
        if(arr1.length > arr2.length){
            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr1.length; j++){
                    if(arr2[i] == arr1[j]){
                        count++;
                    }
                }
            }
            return count == arr2.length;
        }
        else{
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr2.length; j++){
                    if(arr1[i] == arr2[j]){
                        count++;
                    }
                }
            }
            return count == arr1.length;
        }
    }
}
