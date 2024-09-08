import java.util.Scanner;
class FloatToDouble{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        double a=sc.nextDouble();
        float castedToFloat=(float)a;
        double castedToDouble=(double)castedToFloat;


        System.out.println("Double value is "+a);
        System.out.println(("casted to float value is: "+castedToFloat));
        System.out.println(("casted to double value is: "+castedToDouble));
        sc.close();
 
    }
}