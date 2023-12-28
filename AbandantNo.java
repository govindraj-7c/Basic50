import java.util.Scanner;
public class AbandantNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int no = sc.nextInt();
        int sum = 0;
        for(int i=1; i<no; i++){
            if(no%i == 0){
                sum += i;
            }
        }
        if(sum > no){
            System.out.println(no+" is Abandant Number.");
        }
        else{
            System.out.println(no+" is Not a Abandant Number.");
        }
    }
}
