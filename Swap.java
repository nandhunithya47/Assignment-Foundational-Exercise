//take 2 numbers as input swap the numbers using addition and subtraction without using 3rd variable
import java.util.Scanner;
class Swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a=sc.nextInt();
        System.out.println("Enter second number b: ");
        int b=sc.nextInt();
        System.out.println("Before swapping a= "+a);
        System.out.println("Before swapping b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a= "+a);
        System.out.println("After swapping b= "+b);
        sc.close();
    }
}