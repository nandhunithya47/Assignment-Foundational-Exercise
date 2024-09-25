public class TypeConversionWithMethods {
    public static int add(double a) {
        return (int) a;
    }
    public static void main(String[] args) {
        float b=13.4f;
        int c=add(b);
        System.out.println(c);




    }
}
