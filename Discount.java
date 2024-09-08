import java.util.Scanner;
class Discount{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Age ");
        int age=scanner.nextInt();
        System.out.println("Do you have Membership ");
        boolean mem=scanner.nextBoolean();
        if(age>=65||mem){
            System.out.println("Elibible for Discount");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        scanner.close();

    }
}