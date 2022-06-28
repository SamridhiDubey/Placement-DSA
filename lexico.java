import java.util.*;
public class MyClass {
    static int[] frequency(String s)
    {
        int freq[]=new int[26];
        for(char i='a'; i<'z';i++)
        {
            for(int j=0;j<n;j++)
            {
                char c = s.charAt(i);
                if (c==i)
                {
                   freq[(i-65)]++; 
                }
            }
        }
        return freq[];
    }
    static String reverse (String pal)
    {
        String rev="";
        for(int i=(pal.length()-1);i>=0;i--)
        {
            rev= rev+pal.charAt(i);
        }
        return rev;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine(); String pal="";
        int a[]=new int[26];
        a[]= frequency(s);
        for(int i=25;i>=0;i--)
        {
            if ((pal=="") && a[i]%2 != 0)
            {
                for(int j =0;j<a[i];j++)
                pal = pal+ Character.toString(i+65);
            }
            if((pal!="") && (a[i]%2 !=0))
            {
                System.out.println("Not a lexicographical palindrome");
                break;
            }
            if((pal=="") && a[i]%2==0)
            {
                for(int j =0;j<a[i];j++)
                pal = pal+ Character.toString(i+65);
            }
             if((pal!="") && a[i]%2==0)
            {
                for(int j =0;j<(a[i]/2);j++)
                pal = pal+ Character.toString(i+65);
                for(int j =0;j<(a[i]/2);j++)
                pal = Character.toString(i+65)+ pal;
            }
        }
        if(pal == (reverse(pal)))
        {
           System.out.println("Lexicograohical palindrome");
        }
    }
}