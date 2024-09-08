import java.util.Scanner;
class Temperature{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the temperature of city one ");
        float temp1=scanner.nextFloat();
        System.out.println("Enter the temperature of city two ");
        float temp2=scanner.nextFloat();
        if(temp1==temp2){
            System.out.println("Temperature in two cities are same");
        }
        else if(temp1>temp2){
            System.out.println("City one is Warmer");
        }
        else{
            System.out.println("City two is warmer");
        }
        scanner.close();

    }
}