//Take age and Citezen ship as input use logical operaters to print The person is elligible to vote if he above 18 and if he is citezen. 
import java.util.Scanner;
class Voting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("you are citizen of this country(true/false): ");
        boolean citezen=sc.nextBoolean();
        if(age>=18 && citezen){
            System.out.println("You are elligible to vote");
        }
        else{
            System.out.println("You are not elligible to vote");
        }
        sc.close();
    }
}

 