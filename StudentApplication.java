import java.util.Scanner;
class Address{
    public String street;
    public String city;
    public String state;
    public String zip;

    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
class Staff {
    public String name;
    public String phone;
    public int id;
    public String email;
    public int age;
    public int experience;
    public String subjectExpertise;
    public Address addr;
    public String staffDetails() {
        return "name= " + this.name + ", age= " + this.age + ", Email id= " + this.email + ", subject expertise= " + this.subjectExpertise;
    }
    public void setAddress(String street, String city, String state, String zip) {
        Address add = new Address(street, city, state, zip);
        this.addr = add;
    }
}
    class Student{
       public String name;
       public String phone;
       public int id;
       public String email;
       public String studentDetailes(){
           return "name= "+this.name +",  phone= "+this.phone+",  email= "+this.email;


       }
    }
public class StudentApplication {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Nandhu";
        s.phone="123-456-789";
        s.email="nandhu@gmail.com";
        String studentRecord=s.studentDetailes();
        System.out.println(studentRecord);

        Student s1=new Student();
        s1.name="Appu";
        s1.phone="123-456-789";
        s1.email="appu@gmail.com";
        String studentRecord1=s1.studentDetailes();
        System.out.println(studentRecord1);

        Staff s2=new Staff();
        s2.name="Nandhu";
        s2.phone="123-456-789";
        s2.id=10;
        s2.email="nandhu@gmail.com";
        s2.age=24;
        s2.experience=3;
        s2.subjectExpertise="Social";
        s2.setAddress("Parvathipura","Bengaluru","Karnataka","562114");
        System.out.println("Staff detailes "+s2.staffDetails());
        System.out.println("Staff Adress:"+s2.addr);

        Staff s3=new Staff();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the staff");
        String name=sc.nextLine();
        System.out.println("Enter the phone number of the staff");
        String phone=sc.nextLine();
        System.out.println("Enter the email id of the staff");
        String email=sc.nextLine();
        System.out.println("Enter the age of the staff");
        int age=sc.nextInt();
        System.out.println("Enter the experience of the staff");
        int experience=sc.nextInt();
        System.out.println("Enter the subject expertise of the staff");
        String subjectExpertise=sc.nextLine();
        System.out.println("Enter the address of the staff");
        s3.setAddress("Parvathipura","Bengaluru","Karnataka","562114");
        System.out.println("Staff detailes "+s3.staffDetails());
        System.out.println("Staff Address:"+s3.addr.street);



    }
}
