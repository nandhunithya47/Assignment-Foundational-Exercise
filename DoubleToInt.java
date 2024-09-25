//take double value as input add 0.5 to it caste it to int and again caste it to double.
import java.util.Scanner;
class DoubleToInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter double value");
        double a=sc.nextDouble();
        int b=(int)(a*5);
        double c=b;
        System.out.println("double value: "+a);
        System.out.println("Int value: "+b);
        System.out.println("Double value of int is: "+c);


        sc.close();
    }
}