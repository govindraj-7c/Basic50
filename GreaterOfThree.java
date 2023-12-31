import java.util.Scanner;
public class GreaterOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();
        if(no1>no2 && no1>no3){
            System.out.println(no1+" is Greater Among All..");
        } else if (no2>no1 && no2>no3) {
            System.out.println(no2+" is Greater Among All..");
        } else {
            System.out.println(no3+" is Greater Among All..");
        }
    }
}
