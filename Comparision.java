//Take 2 inputs and use comparision operators "==,<=,>=,<,>!="
import java.util.Scanner;
class Comparision{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("(a==b):"+(a==b));
        System.out.println("(a!=b): "+(a!=b));
        System.out.println("(a<b): "+(a<b));
        System.out.println("(a>b): "+(a>b));
        System.out.println("(a<=b): "+(a<=b));
        System.out.println("(a>=b): "+(a>=b));
        sc.close();
    }
}