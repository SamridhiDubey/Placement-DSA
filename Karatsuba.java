import java.util.*;
import java.lang.*;
public class MyClass {
    long getSize(long a)
    {int c=0;
        while(a>0)
        {
            c++;
            a=a/10;
        }
        return c;
    }
    long multiply(long n1, long n2)
    {
     long a,b,c,d,s1,s2,n=0;
        if(n1<10 && n2<10)
        return n1*n2;
        else
        {
            s1=getSize(n1);
            s2=getSize(n2);
            n=Math.max(s1,s2);
         n=((n/2)*(n%2));
            a=n1/(long)(Math.pow(10,n));
            b=n1-a;
            c=n2/(long)(Math.pow(10,n));
            d=n2-c;
            
            return (a*c *(long)Math.pow(10,2*n) + (a+b)*c+d-a*c-b*d * (long)Math.pow(10,n) + b*d);
        }
    }
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Karatsuba Multiplication Algorithm Test\n");
        /** Make an object of Karatsuba class **/
      MyClass kts=new MyClass();
 
        /** Accept two integers **/
        System.out.println("Enter two integer numbers\n");
        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        /** Call function multiply of class Karatsuba **/
        long product = kts.multiply(n1, n2);
        System.out.println("\nProduct : "+ product);
    }
}