public class MathClass {
    public static void main(String[] args){


        // Math.abs(double) returns positive value for both positive and negative inputs.
        double a= -16.976;
        double b=Math.abs(a);
        System.out.println(b);
        System.out.println(" ");
        System.out.println(" ");


        // Math.abs(float) returns positive value for both positive and negative inputs.
        float c= -2.33f;
        float d=Math.abs(c);
        System.out.println(d);
        System.out.println(" ");
        System.out.println(" ");


        // Math.abs(int) returns positive value for both positive and negative inputs.
        int e=-12;
        int f=Math.abs(e);
        System.out.println(f);
        System.out.println(" ");
        System.out.println(" ");


        // Math.abs(long) returns positive value for both positive and negative inputs.
        long g=-15678902;
        long h=Math.abs(g);
        System.out.println(h);
        System.out.println(" ");
        System.out.println(" ");

        // Math.absExact(int) returns positive value for both positive and negative inputs.
        //Gives the Arithmetic exception if the result overflows positive integer range.
        //same for long.
        try{
        int i=-21;    //if --2147483648 is given exception is thrown and further program is not executed
        int j=Integer.MIN_VALUE;
        System.out.println("Absolute value of" +i+ ": "+Math.absExact(i));
        System.out.println("Absolute value of" +j+ ": "+Math.absExact(j));
        }
        catch(ArithmeticException m){
            System.out.println("Exception: "+m.getMessage());
        }
        System.out.println(" ");
        System.out.println(" ");


        // Math.addExact(var 1,var2) returns positive value for both positive and negative inputs.
        //returns sum of arguments and throws exception if result overflows positive number.
        //samr for long 
        try{
        int k1=((Integer.MIN_VALUE)/2)-1;
        int k2=(Integer.MIN_VALUE)/2;
        int l=Math.addExact(k1, k2);
        System.out.println("EXACT VALUE OF IS: "+l);
        }
        catch(ArithmeticException n){
            System.out.println("Exception: "+n.getMessage());
        }
        System.out.println(" ");
        System.out.println(" ");

        // Math.acos(double) returns arc cosine which is inverse of cosine.
        //can range from -1.0 to 1.0 cosine means 0 to PI radians means 0 to 180 degrees. 
        //value of cos -pi is -1 and cos pi is 1.
        double value1=0.86;
        double value2=8.87;
        double angle1=Math.acos(value1);
        double angle2=Math.acos(value2);
        System.out.println("acos(0.86)= "+angle1+" radians");//converting values to radians.
        System.out.println("acos(8.87)= "+angle2+" radians");
        System.out.println("acos(0.86)= "+Math.toDegrees(angle1)+" Degrees");//converting radians to degrees.
        System.out.println("acos(3.46)= "+Math.toDegrees(angle2)+" Degrees");
        System.out.println(" ");
        System.out.println(" ");
        

        // Math.asin(double) returns arc sine which is inverse of sine.
        //can range from -1 to 1 cosine means -PI/2 to PI/2 radians means -90 to 90 degrees. 
        //value of sin -pi/2 is -1 and sin pi/2 is 1.
        //same for atan
        double val1=0.86;
        double val2=8.87;
        double angle11=Math.asin(val1);
        double angle22=Math.asin(val2);
        System.out.println("asin(0.86)= "+angle11+" radians");//converting values to radians.
        System.out.println("asin(8.87)= "+angle22+" radians");
        System.out.println("asin(0.86)= "+Math.toDegrees(angle11)+" Degrees");//converting radians to degrees.
        System.out.println("asin(3.46)= "+Math.toDegrees(angle22)+" Degrees");
        System.out.println(" ");
        System.out.println(" ");

        // Math.atan2(double) returns angle theta from conversion of rectagular coordinates(x,y) to polar coordinates(r,theta)
        double x=0.86;
        double y=8.87;
        double theta=Math.atan2(y,x);
        System.out.println("angle theta in radians is: "+theta);
        System.out.println("angle in radius is: "+Math.toDegrees(theta));
        System.out.println(" ");
        System.out.println(" ");

        //Math.cbrt(double)returns cuberoot of double
        double o=Math.cbrt(2.9875);
        System.out.println(o);
        System.out.println(" ");
        System.out.println(" ");

        //Math.ceil(double)returns rounded nearest samllest integer greater than input value
        double p=Math.ceil(2.9875);
        System.out.println(p);
        System.out.println(" ");
        System.out.println(" ");
        

        //Math.ceilDiv(int)returns divides and rounded nearest samllest integer greater than input value
        //same for long, int and long,long
        int q=Math.ceilDiv(22,53);
        System.out.println(q);
        System.out.println(" ");
        System.out.println(" ");
        

        /*
        //Math.ceilDivExact-(double)returns rounded nearest samllest integer greater than input value
        //Gives division by 0 error

        class CeilExactDiv{
        public static void main(String[] args){
        int s=7;
        int t=3;
        try{
            int u=Math.ceilDivExact(s,t);
            System.out.println("result is: "+u);
        }
        catch(ArithmeticException v){
            System.out.println(v.getMessage());
        }
        } 
        public static int ceilExactDiv(int s,int t){
            if(t==0){
                throw new ArithmeticException("Division by zero");
            }
            return (s+t-1)/t;
        }
    }
        
        */ 
        //Math.mod(int)returns remainder with ceil
        int w=Math.ceilMod(22,76);
        System.out.println(w);
        System.out.println(" ");
        System.out.println(" ");



        

    }
}
