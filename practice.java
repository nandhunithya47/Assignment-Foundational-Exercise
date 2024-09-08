class practice{
    public static void main(String[] args){
        int s=7;
        int t=3;
        try{
            int u=Math.ceilDivExact(s,t);
            System.out.println("result is: "+u);
        }
        catch(ArithmeticException v){
            System.out.println("error" +v.getMessage());
        }
    } 
     public static int ceilExactDiv(int s,int t){
        if(t==0){
            throw new ArithmeticException("Division by zero");
        }
        return (s+t-1)/t;
    }
}