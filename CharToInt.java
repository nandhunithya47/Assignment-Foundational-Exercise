import java.util.Scanner;
class CharToInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char a=sc.next().charAt(0);
        int charInt=a-'0';
        System.out.println("Char is "+a);
        System.out.println("Char to Int is value is: "+charInt);
        
        sc.close();
 
    }
}