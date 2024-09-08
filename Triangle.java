import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int angle1=scanner.nextInt();
        System.out.println("Enter the Second number ");
        int angle2=scanner.nextInt();
        System.out.println("Enter the Third number ");
        int angle3=scanner.nextInt();
        if(angle1>0 && angle2>0 && angle3>0 &&(angle1+angle2+angle3==180)){
            System.out.println("Angles are valid for triangle ");
        }
        else{
            System.out.println("Angles are not valid for triangle ");
        }
        scanner.close();

    }
}