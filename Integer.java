import java.util.Scanner;
class integer{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=scanner.nextInt();
        

        if((num>10&&num<50) ||num%7==0){
            System.out.println("The number is in the rage or divisible is 7 ");
        }
        else{
            System.out.println("The number is not in the range and not divisible by 7");
        }
        scanner.close();

    }
}