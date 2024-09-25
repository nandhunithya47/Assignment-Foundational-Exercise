//take input in double caste to float and again to double print all three
import java.util.Scanner;
class FloatToDouble{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter double value: ");
        double a=sc.nextDouble();
        float b=(float)(a*0.5);
        double c=b;
        System.out.println("double value is "+a);
        System.out.println("float value is: "+b);
        System.out.println("Double value is: "+c);

        sc.close();
    }
}