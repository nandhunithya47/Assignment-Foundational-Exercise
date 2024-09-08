import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year ");
        int year=scanner.nextInt();
        boolean leapYear=(year%4==0)&&(year%100!=0 || year%400==0);
        
       
        if(leapYear){
            System.out.println("THE year is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        scanner.close();

    }
}