import java.util.*;
public class moveSpaceToFrontOfString {
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      String s = sc.nextLine(); int c=0;
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)==' ')
          c++;
      }
      String rep= s.replaceAll(" ","");
      for(int i=0;i<c;i++)
      {
          rep=" "+rep;
      }
      System.out.println(rep);
    }
}