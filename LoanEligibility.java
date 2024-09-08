import java.util.Scanner;
class LoanEligibility{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter income");
        int num1=scanner.nextInt();
        System.out.println("enter credit score ");
        int num2=scanner.nextInt();
        System.out.println("enter Existing debts ");
        int num3=scanner.nextInt();

        if(num1>=300000&&num2>=650&&num3<30000){
            System.out.println("EEligible for loan");
        }
        else{
            System.out.println("Not Elligibel For loan");
        }
        scanner.close();

    }
}