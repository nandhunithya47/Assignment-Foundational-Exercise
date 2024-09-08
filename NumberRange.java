import java.util.Scanner;
class NumberRange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num>=1 && num<=100){
            System.out.println("The Number is in the range");
        }
        else{
            System.out.println("The number is out of range");
        }
        sc.close();
    }
}
