import java.util.*;
public class calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  a= sc.nextInt();
        double   b = sc.nextInt();
        double  sum = a+b;
        double  diff=a-b;
        double mul = a*b;
        double div = a/b;
        double rmdr= a%b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rmdr);


    }
}
