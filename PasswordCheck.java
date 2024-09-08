import java.util.Scanner;
class PasswordCheck{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Password to check if it is strong or weak");
        String password=sc.nextLine();
        boolean len=password.length()>=8;
        boolean num=false;
        boolean letter=false;
        boolean space=false;

        for(int i =1;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isLetter(ch)){
                letter=true;
            }
            else if(Character.isDigit(ch)){
                num=true;
            }
            else if(Character.isWhitespace(ch)){
                space=true;
            }
        }
        if(len && num && letter && !space){
            System.out.println("The password is strong");
        }
        else{
            System.out.println("The password is weak");
        }
        sc.close();
    }
}