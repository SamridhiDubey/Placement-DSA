import java.util.*;
public class leader {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int leader = arr[n-1];
        int j;
        for(int i=0; i<n;i++)
        {
            for(j=i+1; j<n;j++)
            {
                if(arr[i]<arr[j])
                break;
            }
            if (j==(n)){
            leader=arr[i];
            System.out.println(leader);}
        }
        
    }
}