import java.util.Scanner;
class CompoundOperators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        a+=12;
        System.out.println(a);
        a-=10;
        System.out.println(a);
        a*=10;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a%=3;
        System.out.println(a);
        sc.close();
    }
}