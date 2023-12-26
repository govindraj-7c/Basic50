import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of ROWS");
        int rows = sc.nextInt();
        System.out.println("Enter No of COLUMNS");
        int col = sc.nextInt();
        int[][] matrix1 = new int[rows][col];
        int[][] matrix2 = new int[rows][col];
        int[][] sum = new int[rows][col];
        System.out.println("Enter First Matrix values");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix Values");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum Of Matrix :");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(sum[i][j]+" ");
                if(j==col-1){
                    System.out.println();
                }
            }
        }
    }
}
