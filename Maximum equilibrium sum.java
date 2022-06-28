import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int arr[]= new int[n];
     int prefix[]= new int[n];
     int suffix[]= new int[n];
     for(int i=0; i<n; i++)
     {
         arr[i]= sc.nextInt();
     }
     prefix[0]=arr[0];
     suffix[n-1]=arr[n-1];
     for(int i=1; i<n; i++)
     {
         prefix[i]=prefix[i-1]+arr[i];
     }for(int i=n-2; i>=0; i--)
     {
         suffix[i]=suffix[i+1]+arr[i];
     }
     int result=0, max=0;
     for(int i=0; i<n; i++)
     {
         if (prefix[i]==suffix[i])
         {
             result = prefix[i];
             max= Math.max(result, prefix[i]);
         }
     }
     System.out.println(max);
    }
}