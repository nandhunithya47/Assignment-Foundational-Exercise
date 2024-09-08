import java.util.Scanner;
class Positive{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1=scanner.nextInt();
        System.out.println("Enter the Second number ");
        int num2=scanner.nextInt();
        System.out.println("Enter the Third number ");
        int num3=scanner.nextInt();
        if(num1>0 && num2>0 && num3>0){
            System.out.println("All are positive ");
        }
        else if(num1>0||num2>0||num3>0){
            System.out.println("Some are Positive");
        }
        else{
            System.out.println("None are positive");
        }
        scanner.close();

    }
}