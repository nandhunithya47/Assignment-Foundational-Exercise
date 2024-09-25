//take char as input convert to integer
import java.util.Scanner;
class CharToInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char");
        char a=sc.next().charAt(0);
        int b=a-'0';
        System.out.println("Character is: "+a);
        System.out.println("interger value is: "+b);


        
        sc.close();
    }
}