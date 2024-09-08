import java.util.Scanner;
class Password{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the password: ");
        int year=scanner.nextInt();
        boolean ispassword8 = password.length()>=8;
        boolean isChar =false;
        boolean isNum=false;
        boolean isSpace=false;
       
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(character.isLetter(ch)){
                isChar=true;
            }
            else if(character.isDigit(ch)){
                isNum=true;
            }
            else if(charater.isWhitespace(ch)){
                isSpace=true;
            }

        }
        if(ispassword8 && isChar && isNum && !isSpace){
            System.out.println("The password is Strong");
        }
        else{
            System.out.println("the password is Weak");
        }
        scanner.close();

    }
}