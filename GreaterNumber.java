import java.util.Scanner;
class GreaterNumber{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1=scanner.nextInt();
        System.out.println("Enter the Second number ");
        int num2=scanner.nextInt();
        System.out.println("Enter the Third number ");
        int num3=scanner.nextInt();
        if(num1==num2 && num2==num3 && num3==num1){
            System.out.println("All are equal ");
        }
        else if(num1>num2 && num1>num3){
            System.out.println("num1 is greater");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num2 is greater");
        }
        else if(num1==num2||num2==num3||num3==1){
            System.out.println("Atleast one pair is equal");
        }
        else{
            System.out.println("num3 is greater");
        }
        scanner.close();

    }
}