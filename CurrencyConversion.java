public class CurrencyConversion {
    public static void main(String[] args) {
        double a=12345.54321;
        double b=(int)(a*100)/100.0;

        int d=((int)b)*100;
        System.out.println(a);
        System.out.println(b);

        System.out.println(d);



    }
}
