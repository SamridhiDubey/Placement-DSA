import java.util.*;
public class Sieve {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[]=new boolean[n];
        
        arr[0]=true;arr[1]=true;
        for(int i = 2; i<n; i++)
        {
            for(int j=i+i;j<n;j=j+i)
            {
                if(arr[j]==false)
                {
                    arr[j]=true;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]==false)
        System.out.println(i);
        }
      
    }
}