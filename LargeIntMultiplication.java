//take long int value and multiply with a value and store in a variable and convert the variable to long and see the difference

import java.util.Scanner;
class LargestintMultiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter int value: ");
        int a=sc.nextInt();
        int c=a*2;
        long d=c;
        System.out.println("Int value is: "+c);
        System.out.println("Long value is: "+d);

        sc.close();
    }
}