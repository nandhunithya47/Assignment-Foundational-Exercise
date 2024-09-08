import java.util.Scanner;
class DoubleToInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        double a=sc.nextDouble();
        double b=a+0.5;
        int intValue=(int)b;
        double doubleValue=(double)intValue;


        
        
        System.out.println("Original Double value: "+a);
        System.out.println("double *0.5: "+b);
        System.out.println("int value: "+intValue);
        System.out.println("double value: "+doubleValue);

       
        
        sc.close();
 
    }
}