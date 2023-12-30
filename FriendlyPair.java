import java.util.Scanner;
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        friendlyPair(no1,no2);
    }
    public static void friendlyPair(int no1, int no2){
        int sum1=0, sum2=0;
        for(int i=1; i<no1; i++){
            if(no1%i == 0){
                sum1 += i;
            }
        }
        for(int i=1; i<no2; i++){
            if(no2%i == 0){
                sum2 += i;
            }
        }
        float rem1 = no1/sum1;
        float rem2 = no2/sum2;
        if(rem1 == rem2){
            System.out.println("Yes, It is Friendly Pair..");
        }
        else{
            System.out.println("No, It is not a Friendly Pair..");
        }
    }
}
