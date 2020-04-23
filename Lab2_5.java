import java.util.*;
public class Lab2_5 {
   public static void main (String[]args) {
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter an hourly wage.");
      double w = kb.nextDouble();
      int i = 1;
      double r = 0;
      double o = 0;
      for(i=1;i<6;i++){
      String day ="";
      if(i == 1)
      day = "Monday";
      else if (i == 2)
      day = "Tuesday";
      else if (i == 3)
      day = "Wednesday";
      else if (i == 4)
      day = "Thursday";
      if (i == 5)
      day = "Friday";
         System.out.println("Enter the number of regular and overtime hours for " +day+ ". (Decimal)");
         r += kb.nextDouble();
         o += kb.nextDouble();
         if (i==5)
         {
            double p, otp;
            otp = o*(1.5*w);
            p = w*r+otp;
            double twp = p;
            System.out.println("Your total weekly pay is " +twp);
         }
      }
   }
}