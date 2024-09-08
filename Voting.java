import java.util.Scanner;
class Voting{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of a person ");
        float age=scanner.nextFloat();
        System.out.println("Are you a citezen ");
        boolean status=scanner.nextBoolean();
       
        if(age>=18 && status){
            System.out.println("elligible to vote");
        }
        else{
            System.out.println("Not elligible to vote");
        }
        scanner.close();

    }
}