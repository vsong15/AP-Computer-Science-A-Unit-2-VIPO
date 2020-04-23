import java.util.*;
public class Lab2_4 {
   public static void main (String [] args){
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter an hourly wage, total regular hours, and total overtime hours.");
      double w = kb.nextDouble();
      double r = kb.nextDouble();
      double o = kb.nextDouble();
      double twp, otp;
      otp = o*(1.5*w);
      twp = w*r+otp;
      System.out.println("Your total weekly pay is "+twp);
   }
}