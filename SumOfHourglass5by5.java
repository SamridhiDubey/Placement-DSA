import java.util.*;
public class SumOfHourglass4by4 {
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 0, 0},
                       {0, 0, 0, 0, 0},
                       {2, 1, 4, 0, 0},
                       {0, 0, 0, 0, 0},
                       {1, 1, 0, 1, 0}};
                          
        int sum, max=Integer.MIN_VALUE;
        // if (R < 3 || C < 3)
        // return -1; 2*2 Not Possible
        for(int i=0; i<3;i++)
        {
            for (int j =0; j<3; j++)
            {
              sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
              if(sum>max)
              max=sum;
            }
        }
        System.out.println(max);
    }
}