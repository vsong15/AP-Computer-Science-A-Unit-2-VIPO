import java.util.*;
public class Minutes{
   public static void main(String[]args) {
      Scanner kb = new Scanner (System.in);
      int y, m;
      System.out.println("Input the number of years.");
      y = kb.nextInt();
      m = y*525600;
      if (y==1)
         System.out.println("Minutes in "+y+" year: "+m+".");
      else
         System.out.println("Minutes in "+y+" years: "+m+".");
   }
}