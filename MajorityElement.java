import java.util.*;
public class MajorityElement {
    static int frequency(int a[], int num, int size)
    {
        int count = 0;
        for(int i=0; i<size; i++)
        {
            if (a[i]==num)
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i =0; i<n; i++)
     {
         arr[i]= sc.nextInt();
     }
     for(int i =0; i<n; i++)
     {
     int f = frequency(arr, arr[i], n);
     if (f>(n/2)){
     System.out.println(arr[i]);
     break;
     }
    }
}
}