import java.util.Scanner;
public class Comparision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a=scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int b=scanner.nextInt();
        
        System.out.println("a==b: " +(a==b));
        System.out.println("a!=b: " +(a!=b));
        System.out.println("a>b:" +(a>b));
        System.out.println("a>=b: " +(a>=b));
        System.out.println("a<b: " +(a<b));
        System.out.println("a<=b: " +(a<=b));
        scanner.close();
    }
}
