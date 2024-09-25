public class OverFlowDetection {
    public static void main(String[] args) {
        short a=22123;
        short b=22191;

        int d=a+b;
        System.out.println(d);
        if(d>Short.MAX_VALUE||d<Short.MIN_VALUE){
            System.out.println("Overflow");

        }
        else{
            short c=(short)d;
            System.out.println("Addition results within overflow: "+d);
        }

    }
}
