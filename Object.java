class Demo{
    public int show(int a,int b){
        return a+b;

    }
    public int get(int a,int b){
        return a*b;
    }
    public double get(double a,int b,int c){
        return a/b*c;
    }
    public int get(int a,int b,int c){
        return a-b;
    }
        }



public class Object {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.show(5,6));
        Demo obj2 = new Demo();
        System.out.println(obj2.show(6,9));
        Demo obj3 = new Demo();
        System.out.println(obj3.show(5,7));
        Demo obj4 = new Demo();
        System.out.println(obj4.show(5,8));
        Demo obj5 = new Demo();
        System.out.println(obj5.show(5,7));
        Demo obj6 = new Demo();
        System.out.println(obj6.show(9,8));
        Demo obj7 = new Demo();
        System.out.println(obj7.show(6,7));
        Demo obj8 = new Demo();
        System.out.println(obj8.show(4,7));
        Demo obj9 = new Demo();
        System.out.println(obj9.show(8,2));
        Demo obj10 = new Demo();
        System.out.println(obj10.show(45,76));
        Demo obj11 = new Demo();
        System.out.println(obj11.show(56,43));
        Demo obj12 = new Demo();
        System.out.println(obj12.show(45,76));
        Demo obj13 = new Demo();
        System.out.println(obj13.show(56,43));
        Demo obj14 = new Demo();
        System.out.println(obj14.get(1,2));
        Demo obj15 = new Demo();
        System.out.println(obj15.get(1,2));
        Demo obj16 = new Demo();
        System.out.println(obj16.get(1,2));
        Demo obj17 = new Demo();
        System.out.println(obj17.get(1,2,7));
        Demo obj18 = new Demo();
        System.out.println(obj18.get(1,2,7));
        Demo obj19 = new Demo();
        System.out.println(obj19.get(1,2,7));
        Demo obj20 = new Demo();
        System.out.println(obj20.get(1,2,7));
        Demo obj21 = new Demo();
        System.out.println(obj21.get(1.1,2,7));
        Demo obj22 = new Demo();
        System.out.println(obj22.get(1.1,2,7));
        Demo obj23 = new Demo();
        System.out.println(obj23.get(9.1,2,7));
        Demo obj24 = new Demo();
        System.out.println(obj24.get(1.1,2,7));
        Demo obj25 = new Demo();
        System.out.println(obj25.get(1.1,2,7));




    }
}
