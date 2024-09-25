//write power of the number without using pow function.
import java.util.Scanner;
class Power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp=sc.nextInt();
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        System.out.println(base+"to the power "+exp+" is: "+result);

        sc.close();
    }
}