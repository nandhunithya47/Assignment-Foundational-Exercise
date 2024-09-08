import java.util.Scanner;
class FloatToInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        float a=sc.nextFloat();
        int castedInt=(int)a;


        System.out.println("Float value is: "+a);
        System.out.println(("casted value is: "+castedInt));
        sc.close();
 
    }
}