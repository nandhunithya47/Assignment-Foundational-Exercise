import java.util.Scanner;
class TrafficLight{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the traffic signal color");
        String light=scanner.nextLine();
        

        if(light.equals("red")){
            System.out.println("Stop");
        }
        else if(light.equals("green")){
            System.out.println("go");
        }
        else if(light.equals("yellow")){
            System.out.println("SlowDown");
        }
        else{
            System.out.println("invalid choice");
        }
        scanner.close();

    }
}