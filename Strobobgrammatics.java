import java.util.*;
public class Strobobgrammatics {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String n = sc.nextLine(); String rev="";
           if (n.length()==1)
           {
               if((n.equals("0")) || (n.equals("1")) || (n.equals("8")))
               System.out.println("Strobogrammatic Number");
               else
               System.out.println("Not a Strobogrammatic Number");
           }
           else
           {
               for(int i=(n.length()-1); i>=0;i--)
               {
                   char c = n.charAt(i);
                   if((c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='7'))
                   {
                       System.out.println("Not a Strobogrammatic Number");
                       break;
                   }
                   if((c=='0')||(c=='1')||(c=='8'))
                   rev=rev+c;
                   if(c=='6')
                   rev=rev+"9";
                   if(c=='9')
                   rev=rev+"6";
                   
               }
               if (n.equals(rev)==true)
               System.out.println("Strobogrammatic Number");
           }
        }
     
    } 
