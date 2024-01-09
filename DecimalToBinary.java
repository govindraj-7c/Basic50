import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int decimal = sc.nextInt();
        //integer array for storing binary digits
        int binary[] = new int[20];
        int i = 0;
        //writing logic for the conversion
        while(decimal > 0)
        {
            int r = decimal % 2;
            binary[i++] = r;
            decimal = decimal/2;
        }
        //printing result
        System.out.print("Binary number : ");
        for(int j = i-1 ; j >= 0 ; j--)
            System.out.print(binary[j]+"");
    }
}
