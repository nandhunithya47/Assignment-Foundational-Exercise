import java.util.Scanner;
class Power{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int base=sc.nextInt();
        System.out.println("Enter the power: ");
        int exp=sc.nextInt();
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
 
        }
        System.out.println("The power is: "+result);
        sc.close();
 
    }
}