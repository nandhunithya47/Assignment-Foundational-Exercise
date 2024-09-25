//take user name are password as input match with predifined credentials if it matches print login successfull or pring unsuccessfull using logical operators.
import java.util.Scanner;
class Passwordcheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username: ");
        String uN=sc.nextLine();
        System.out.println("Enter the Password");
        String pW=sc.nextLine();
        String Username="Nandhu";
        String Password="Shree";
        
        if(uN.equals(Username) && pW.equals(Password)){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Login Failed");
        }
        sc.close();
    }
}