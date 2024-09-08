import java.util.Scanner;
class AgeValidator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of a person ");
        float age=scanner.nextFloat();
       
        if(age<18){
            System.out.println("person is minor");
        }
        else if(age>=18){
            System.out.println("Person is Adult");
        }
        else if(age>=65){
            System.out.println("Person is an Senior citezen");
        }
        scanner.close();

    }
}