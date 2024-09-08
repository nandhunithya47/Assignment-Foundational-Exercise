import java.util.Scanner;
class Division{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=scanner.nextInt();
        if(num%2==0 & num%5==0){
            System.out.println("The number is even and Divisible by 5");
        }
        else{
            System.out.println("The number is either not divisible 2 or 5");
        }
        scanner.close();

    }
}