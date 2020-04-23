import java.util.*;
public class Lab2_3 {
   public static void main (String[]args){
   Scanner kb = new Scanner (System.in);
   System.out.println("Enter a mass and a velocity. (Decimal)");
   double m = kb.nextDouble();
   double v = kb.nextDouble();
   double ke, mo;
   ke = 0.5*m*v*v;
   mo = m*v;
   System.out.println("The kinetic energy is "+ke);
   System.out.println("The momentum is "+mo);
   }
}
