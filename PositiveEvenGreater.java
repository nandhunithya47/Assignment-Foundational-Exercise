import java.util.Scanner;
class PositiveEvenGreater{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the attendance percentage ");
        int num=scanner.nextInt();
        

        if(num>0&&num%2==0&&num>100){
            System.out.println("number is positive ,even and Greater than 100");
        }
        else{
            System.out.println("The number is not either positive,even or greater than 100");
        }
        scanner.close();

    }
}