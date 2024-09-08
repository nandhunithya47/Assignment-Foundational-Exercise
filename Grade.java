import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Grade of Student 1: ");
        float grade1=scanner.nextFloat();
        System.out.println("Enter the Grade of Student 2: ");
        float grade2=scanner.nextFloat();
        if(grade1==grade2){
            System.out.println("Grades of Student1 and Student2 is same");
        }
        else if(grade1>grade2){
            System.out.println("Grades of Student1 is more than grades of Student2");
        }
        else{
            System.out.println("Grades of Student2 is more than grades of Student1");
        }
        scanner.close();

    }
}