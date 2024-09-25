//take 3 angles as input... if sum of all 3 angles are 180 degrees then it is trianle or it is not... using logical operators

import java.util.Scanner;
class Triangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angle one: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd angle");
        int b=sc.nextInt();
        System.out.println("Enter 3rd angle");
        int c=sc.nextInt();
        if(a>=0&b>=0&c>=0 &&(a+b+c==180)){
            System.out.println("the angles make triangle");

        }
        else{
            System.out.println("The angles does not make Triangle");
        }
        sc.close();
    }
}