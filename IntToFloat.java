//take 2 int inputs , divide these 2 assign to other varible  float.. and divide same variable in float datatype for all variable and see the difference.
import java.util.Scanner;
class IntToFloat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a=sc.nextInt();
        System.out.println("Enter second value: ");
        int b=sc.nextInt();
        int c=a/b;
        float d=(float)c;
        float e=(float)a/(float)b;
        System.out.println("int value is: "+c);
        System.out.println("int to Float value is: "+d);
        System.out.println("real Float value is "+e);

        
        sc.close();
    }
}