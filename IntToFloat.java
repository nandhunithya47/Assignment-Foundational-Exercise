import java.util.Scanner;
class IntToFloat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter the number: ");
        int b=sc.nextInt();
        float c=a/b;
        float d=(float)a/(float)b;
        
        
        System.out.println("int division: "+c);
        System.out.println("float division result: "+d);
       
        
        sc.close();
 
    }
}