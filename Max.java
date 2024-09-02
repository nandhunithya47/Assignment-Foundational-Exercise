import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a=scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b=scanner.nextInt();
        System.out.println("Enter 3rd integer: ");
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+ "is greater");
        }
        else{
            System.out.println(c+ " is greater");
        }
        scanner.close();
    }
    
}
