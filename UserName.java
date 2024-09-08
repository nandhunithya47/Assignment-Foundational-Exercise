import java.util.Scanner;
class UserName{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the username ");
        String un=scanner.nextLine();
        System.out.println("Enter the password ");
        String pw=scanner.nextLine();
        String userName="Nandhu";
        String password="Shree";

        if(un.equals(userName) && pw.equals(password)){
            System.out.println("Login Successfull ");
        }
        else{
            System.out.println("login failed");
        }
        scanner.close();

    }
}