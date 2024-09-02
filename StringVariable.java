class StringVariable{
    public static void main(String[] args){
        String a="Nandhu Shree";
        String b=a.toUpperCase();
        System.out.println("Upper case: "+b);
        String c=a.toLowerCase();
        System.out.println("Lower Case: "+c);
        String d=new StringBuilder(a).reverse().toString();
        System.out.println("Reversed String: "+d);
    }
}