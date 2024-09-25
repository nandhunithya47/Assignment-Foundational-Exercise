public class TypeDrivenControlFlow {
    public static void main(String[] args) {
        int a=45678;
        byte b=(byte)a;
        int c=b;
        System.out.println(b);
       String d= (a==c)?"With in Byte range":"Out of byte range";
        System.out.println(d);
        System.out.println(c);
    }
}
