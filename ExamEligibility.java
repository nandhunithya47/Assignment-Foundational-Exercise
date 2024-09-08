import java.util.Scanner;
class ExamEligibility{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the attendance percentage ");
        int num1=scanner.nextInt();
        System.out.println("Enter the Average Grafe ");
        int num2=scanner.nextInt();
        

        if(num1>=75&&num2>=50){
            System.out.println("Elligible gor Exam");
        }
        else{
            System.out.println("Not Elligibel For Exam");
        }
        scanner.close();

    }
}