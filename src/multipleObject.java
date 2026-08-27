import java.net.SocketOption;

 class aktu {
     String name;
     int marks;
 }
    public class multipleObject {
       public  static void main(String[] args) {
            aktu s1= new aktu ();
            aktu s2= new aktu();
            s1.name="chandan";
            s1.marks=95;
            s2.name="rohit";
            s2.marks=98;
            System.out.println(s1.name);
            System.out.println(s1.marks);
            System.out.println(s2.name);
            System.out.println(s2.marks);
        }
    }
