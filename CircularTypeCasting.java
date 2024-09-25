public class CircularTypeCasting {
    public static void main(String[] args) {
        int a=254;
        byte b=(byte)a;
        char c=(char)b;
        int d=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
