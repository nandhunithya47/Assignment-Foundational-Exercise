//Check if the year is leap year or not using logical operators by taking input from the user.
import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year=sc.nextInt();
        if((year%4==0&year%100!=0)||(year%400==0)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
        
        sc.close();
    }
}
