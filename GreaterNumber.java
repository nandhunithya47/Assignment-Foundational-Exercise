//take 3 number inputs from user and print if all the numbers are equal, all are different or atleast one is equal and which of the 3 is greater using logical operators
import java.util.Scanner;
class GreatestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enyter second number");
        int b=sc.nextInt();
        System.out.println("Enyter Third number");
        int c=sc.nextInt();
        if(a==b&&b==c&&c==a){
            System.out.println("All are equal");
        }
        else if(a==b||b==c||c==a){
            System.out.println("Alteast one is equal");
        }
        else{
            System.out.println("None are equal");

        }
        if(a>b&&a<c){
            System.out.println(a+ " is graeter");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+ " is greater");
        }
        sc.close();
    }
}