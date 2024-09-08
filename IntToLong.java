import java.util.Scanner;
class IntToLong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        byte a=sc.nextByte();
        System.out.println("Enter the number: ");
        Short b=sc.nextShort();
        int c=a+b;
        long intToLong=c;

        


        System.out.println("Byte value is "+a);
        System.out.println(("Short value is: "+b));
        System.out.println(("int value is: "+c));
        System.out.println(("long value is: "+intToLong));
        sc.close();
 
    }
}