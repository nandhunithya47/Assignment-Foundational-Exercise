//take 2 inputs in byte and short add to other int variable and convert int to long and print all four
import java.util.Scanner;
class IntToLong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the byte value: ");
        byte a=sc.nextByte();
        System.out.println("Enter the short value: ");
        short b=sc.nextShort();
        int c=a+b;
        int d=c;
        System.out.println("Byte value is: "+a);
        System.out.println("Short value is: "+b);
        System.out.println("int  value is: "+c);
        System.out.println("long value is: "+d);
        

        sc.close();
    }
}