//use logical operators to print if number is positive even and greater than 100.
import java.util.Scanner;
class PositiveEvenGreater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        
        if(a>=0 && a%2==0 && a>=100){
            System.out.println("the number is positive,even and Greater than 100");
        }
        else{
            System.out.println("The number is mnot either positive,even or greater than 100");
        }
        sc.close();
    }
}