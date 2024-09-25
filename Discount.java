//Take age and membership as input. the person is elligible for discount if the person is senior citezen and if member.
import java.util.Scanner;
class Discount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("you hold the membership(true/false): ");
        boolean member=sc.nextBoolean();
        if(age>65&&member){
            System.out.println("Elligible for Discount");
        }
        else{
            System.out.println("Not elligible for discount ");
        }
        sc.close();
    }
}