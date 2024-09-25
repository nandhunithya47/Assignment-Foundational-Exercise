//caste float to int print the results before and after
import java.util.Scanner;
class FlotToInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter float value: ");
        float a=sc.nextFloat();
        int intvalue=(int)a;
        System.out.println("Float value: "+a);
        System.out.println("Int value is: "+intvalue);
        sc.close();
    }
}