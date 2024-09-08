import java.util.Scanner;
class Swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter the other number: ");
        int b=sc.nextInt();
        System.out.println("Before Swapping a= "+a+ " b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a= "+a+ " b= " +b);
        sc.close();
 
    }
}